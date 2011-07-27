package com.kap.services.util;

public class Validator {

    public static final int STANDARD = 0;
    public static final int SPANISH = 2;
    public static final int GERMAN = 4;

    private static final String alphanumericsAllowed = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
    private static final String lettersAllowed = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    private static final String numbersAllowed = "0123456789";
    private static final String specialCharactersAllowed = "-#º.";
    private static final String germanSpecialCharactersAllowed = "ÄäÖöÜüß";
    private static final String spanishSpecialCharactersAllowed = "ÁáÉéÍíÓóÚúÜü";

//    public static boolean sinEspacios(String texto){
//        if(texto==null){
//            return false;
//        }
//        for(int i=0; i<texto.length(); i++){
//            char ch = texto.charAt(i);
//            if(Character.isSpaceChar(ch)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean validarLetras(String texto){
//        if(texto==null){
//            return false;
//        }
//        String textoSinEspacios = texto.trim();
//        for(int i=0; i<textoSinEspacios.length(); i++){
//            char ch = textoSinEspacios.charAt(i);
//            if(letrasPermitidas.indexOf(ch)==(-1) && !Character.isSpaceChar(ch)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean validarNumeros(String texto){
//        if(texto==null){
//            return false;
//        }
//        String textoSinEspacios = texto.trim();
//        for(int i=0; i<textoSinEspacios.length(); i++){
//            char ch = textoSinEspacios.charAt(i);
//            if(numerosPermitidos.indexOf(ch)==(-1) && !Character.isSpaceChar(ch)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean validarAlfanumericos(String texto){
//        if(texto==null){
//            return false;
//        }
//        String textoSinEspacios = texto.trim();
//        for(int i=0; i<textoSinEspacios.length(); i++){
//            char ch = textoSinEspacios.charAt(i);
//            if(alfanumericosPermitidos.indexOf(ch)==(-1) && !Character.isSpaceChar(ch)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean validarEspeciales(String texto){
//        if(texto==null){
//            return false;
//        }
//        String textoSinEspacios = texto.trim();
//        for(int i=0; i<textoSinEspacios.length(); i++){
//            char ch = textoSinEspacios.charAt(i);
//            if(especialesPermitidos.indexOf(ch)==(-1) && !Character.isSpaceChar(ch)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean validarVacio(String texto){
//        if(texto==null){
//            return false;
//        }
//        String textoSinEspacios = texto.trim();
//        if(textoSinEspacios.isEmpty()){
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean validarCantidad(Float cantidad){
//
//        boolean result = false;
//        try{
//            if(cantidad>=0){
//                result = true;
//                String salario = Float.toString(cantidad);
//                for(int i=0; i<salario.length(); i++){
//                    char ch = salario.charAt(i);
//                    if(numerosPermitidos.indexOf(ch)==(-1) && ch!='.'){
//                        result = false;
//                        break;
//                    }
//                }
//            }
//        }
//        catch(Exception e){
//            result = false;
//        }
//        return result;
//    }

    public static boolean isAlphanumeric(String text, boolean spacesAllowed, int language) {
        if(Validator.isEmpty(text)){
            return false;
        }
        String allowedCharacters = alphanumericsAllowed;
        if(language == GERMAN) allowedCharacters+= germanSpecialCharactersAllowed;
        if(language == SPANISH) allowedCharacters+= germanSpecialCharactersAllowed;
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(allowedCharacters.indexOf(ch)==(-1)||(!spacesAllowed && Character.isSpaceChar(ch))){
                return false;
            }
        }
        return true;
    }

    private static boolean isEmpty(String text) {
        if(text==null){
            return true;
        }
        if(text.isEmpty()||(text.length()==0)||text.trim().isEmpty()||(text.trim().length()==0)){
            return true;
        }
        return false;
    }

}
