package controllers;

import java.util.ArrayList;

public class FindResults {

    /**
     * Atributos que sirven para realizar le generación de códigos a partir del
     * tipo de busqueda
     */
    private String abc = "abcdefghijklmnopqrstuvwxyz";
    private String abcMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String numbers = "0123456789";

    private ArrayList<String> listOfResults = new ArrayList<String>();
    private char charToFind = '#';

    /**
     * Constructor vacío
     */
    public FindResults() {
    }

    //CC-9wY6c-5xoe$-gf9oy$
    /**
     * Método para obtener resultados que unicamente tengan letras minúsculas en
     * su código
     *
     * @param code Código para generar posibles combinaciones
     * @return Lista de códigos generados
     */
    public ArrayList<String> getResultsOnlyLowerUpperCase(String code) {
        char[] codigoArray = code.toCharArray();
        generarCombinaciones(codigoArray, 0, abc, "", listOfResults);

        return listOfResults;
    }

    /**
     * Método para obtener resultados que unicamente tengan letras mayúsculas en
     * su código
     *
     * @param code Código para generar posibles combinaciones
     * @return Lista de códigos generados
     */
    public ArrayList<String> getResultsOnlyHighUpperCase(String code) {
        char[] codigoArray = code.toCharArray();
        generarCombinaciones(codigoArray, 0, abcMayus, "", listOfResults);

        return listOfResults;
    }

    /**
     * Método para obtener resultados que unicamente tengan números en su código
     *
     * @param code Código para generar posibles combinaciones
     * @return Lista de códigos generados
     */
    public ArrayList<String> getResultsOnlyNumbers(String code) {
        char[] codigoArray = code.toCharArray();
        generarCombinaciones(codigoArray, 0, numbers, "", listOfResults);

        return listOfResults;

    }

    /**
     * Método para obtener resultados que tengan consigo, letras mayúsculas y
     * minúsculas, así como números en su código
     *
     * @param code Código para generar posibles combinaciones
     * @return Lista de códigos generados
     */
    public ArrayList<String> getAllResults(String code) {
        String chainAux = abc + abcMayus + numbers;

        char[] codigoArray = code.toCharArray();
        generarCombinaciones(codigoArray, 0, chainAux, "", listOfResults);

        return listOfResults;
    }

    /**
     * Método para generar las posibles combinaciones de código
     * @param codigo Código a evaluar
     * @param index Posición para hacer el cambio
     * @param caracteres Cadena con los posibles cambios
     * @param actual Cadena para generar nuevo resultado
     * @param combinaciones Lista en la cual se estaran guardando los códigos generados
     */
    private void generarCombinaciones(char[] codigo, int index, String caracteres, String actual, ArrayList combinaciones) {
        if (index == codigo.length) {
            combinaciones.add(actual);
            return;
        }

        if (codigo[index] == charToFind) {
            for (int i = 0; i < caracteres.length(); i++) {
                char caracter = caracteres.charAt(i);
                generarCombinaciones(codigo, index + 1, caracteres, actual + caracter, combinaciones);
            }
        } else {
            generarCombinaciones(codigo, index + 1, caracteres, actual + codigo[index], combinaciones);
        }
    }

}
