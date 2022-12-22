package com.optisol.divinetoast

import android.content.Context
import android.widget.Toast


/**
 * Created by Siva G Gurusamy on 22,December,2022
 * Organization   : OptiSol Business Solutions Pvt Ltd
 * Official Email : siva.g@optisolbusiness.com
 */
object OptiToast {

    fun default(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun welcomeMsg(context: Context?, message: String?) {
        Toast.makeText(context, "Welcome to OptiSol! Hello, $message", Toast.LENGTH_SHORT).show()
    }
}