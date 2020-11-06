package com.iconic_dev.retrofitcall.api

import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.ClassCastException
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Created by manuelchris-ogar on 02/11/2020.
 */
class SimpleCallAdapterFactory(): CallAdapter.Factory(){
    override fun get(
        returnType: Type?,
        annotations: Array<Annotation>?,
        retrofit: Retrofit?
    ): CallAdapter<*, *>? {
        return returnType.let {
            return try {

                val enclosingType = (it as ParameterizedType)
//                ensure type wrapper is thesame
                if(enclosingType.rawType != Simple::class.java)
                    null
                else{
                    val type = enclosingType.actualTypeArguments[0]
                    SimpleCallAdapter<Object>(type)
                }
            }catch (es:ClassCastException){
                null
            }
        }

    }



    companion object {
        @JvmStatic
        fun create() = SimpleCallAdapterFactory()
    }

}