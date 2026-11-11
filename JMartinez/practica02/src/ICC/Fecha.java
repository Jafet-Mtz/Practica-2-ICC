/*
*La clase fecha va a permitir crear operaciones con fechas 
*
*@author Jafet Martinez Jose 
*@version 1.0
*@date 13 de Noviembre del 2026
*/


public class Fecha {
    private int day;
    private int month; 
    private int year;

    //  Constructores
    public Fecha() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Fecha(int day, int month, int year) {
        asignarFecha(day, month, year);
    }

    public Fecha(int day, int year, String nombreMes) {
        this.day = day;
        this.year = year;
        this.month = obtenerNumeroMes(nombreMes);
    }

    //  Asignar valor a los campos con validación
    public void asignarFecha(int day, int month, int year) {
        if (esValida(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    // (c) Obtener campos
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    // Validación de año bisiesto
    public boolean esBisiesto() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Días exactos por mes (considerando febrero bisiesto o normal)
    public int diasDelMes(int m) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                return 31;
            case 4: case 6: case 9: case 11: 
                return 30;
            case 2: 
                return esBisiesto() ? 29 : 28;
            default: 
                return 0;
        }
    }

    // Validador general de la fecha
    private boolean esValida(int d, int m, int y) {
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > diasDelMes(m)) return false;
        return true;
    }

    //  Número de mes por nombre en inglés
    public int obtenerNumeroMes(String nombre) {
        if (nombre == null) return 1;
        String n = nombre.toLowerCase().trim();
        if (n.startsWith("jan")) return 1;
        if (n.startsWith("feb")) return 2;
        if (n.startsWith("mar")) return 3;
        if (n.startsWith("apr")) return 4;
        if (n.startsWith("may")) return 5;
        if (n.startsWith("jun")) return 6;
        if (n.startsWith("jul")) return 7;
        if (n.startsWith("aug")) return 8;
        if (n.startsWith("sep")) return 9;
        if (n.startsWith("oct")) return 10;
        if (n.startsWith("nov")) return 11;
        if (n.startsWith("dec")) return 12;
        return 1;
    }

    //  Nombre de mes por número (en inglés para mostrarse estético)
    public String obtenerNombreMes(int m) {
        String[] meses = {"", "January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        return (m >= 1 && m <= 12) ? meses[m] : "Unknown";
    }

    // Días transcurridos en el año
    public int diasTranscurridosAnio() {
        int totalDias = 0;
        for (int i = 1; i < month; i++) {
            totalDias += diasDelMes(i);
        }
        return totalDias + day - 1;
    }

    private int aDiasTotales() {
        int total = day;
        for (int i = 1; i < month; i++) {
            total += diasDelMes(i);
        }
        total += year * 365 + (year / 4) - (year / 100) + (year / 400);
        return total;
    }

    //  Diferencia en días entre dos fechas
    public int diferenciaDias(Fecha otraFecha) {
        return Math.abs(this.aDiasTotales() - otraFecha.aDiasTotales());
    }

    //  Sumar o restar días
    public Fecha sumarDias(int diasAdicionales) {
        int nuevoDia = this.day + diasAdicionales;
        int nuevoMes = this.month;
        int nuevoAnio = this.year;

        if (diasAdicionales >= 0) {
            while (nuevoDia > diasDelMes(nuevoMes)) {
                nuevoDia -= diasDelMes(nuevoMes);
                nuevoMes++;
                if (nuevoMes > 12) { nuevoMes = 1; nuevoAnio++; }
            }
        } else {
            while (nuevoDia < 1) {
                nuevoMes--;
                if (nuevoMes < 1) { nuevoMes = 12; nuevoAnio--; }
                nuevoDia += diasDelMes(nuevoMes);
            }
        }
        return new Fecha(nuevoDia, nuevoMes, nuevoAnio);
    }

    //  Comparar si dos fechas son iguales
    public boolean esIgual(Fecha otraFecha) {
        return this.day == otraFecha.day && this.month == otraFecha.month && this.year == otraFecha.year;
    }

    //  Formato dd/mes/aaaa
    @Override
    public String toString() {
        return day + "/" + obtenerNombreMes(month) + "/" + year;
    }
}
