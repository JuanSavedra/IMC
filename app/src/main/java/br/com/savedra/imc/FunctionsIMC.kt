package br.com.savedra.imc

import kotlin.math.pow

fun calculateIMC(weight: Double, height: Double): Double {
    var imc = weight / (height / 100).pow(2)
    return imc
}

fun getResultsIMC(userIMC: Double): String {
    return if (userIMC < 18.5) {
        "Abaixo do peso"
    } else if (userIMC >= 18.5 && userIMC < 25.0) {
        "Peso ideal"
    } else if (userIMC >= 25.0 && userIMC < 30.0) {
        "Levemente acima do peso"
    } else if (userIMC >= 30.0 && userIMC < 35.0) {
        "Obesidade Grau I"
    } else if (userIMC >= 35.0 && userIMC < 40.0) {
        "Obesidade Grau II"
    } else {
        "Obesidade Grau III"
    }
}