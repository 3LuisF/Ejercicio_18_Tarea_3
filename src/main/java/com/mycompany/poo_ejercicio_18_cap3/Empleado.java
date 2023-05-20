
package com.mycompany.poo_ejercicio_18_cap3;

/*Atributos*/
public class Empleado {
    String Codigo_Empleado, Nombre;
    int Numero_Horas_Trabajadas;
    double Valor_Hora, Porcentaje_Retencion;
    static double Salario_Bruto;
    static double Salario_Neto;

    public Empleado(String Codigo_Empleado, String Nombre, int Numero_Horas_Trabajadas, double Valor_Hora, double Porcentaje_Retencion) {
        this.Codigo_Empleado = Codigo_Empleado;
        this.Nombre = Nombre;
        this.Numero_Horas_Trabajadas = Numero_Horas_Trabajadas;
        this.Valor_Hora = Valor_Hora;
        this.Porcentaje_Retencion = Porcentaje_Retencion;
    }
    
    public static double Salida_Salario_Bruto(double NumHoras,double ValorHora) {
        Salario_Bruto = NumHoras * ValorHora;
        return Salario_Bruto;
      
    }
    public static double Salida_Salario_Neto(double NumHoras,double ValorHora,double PorcRete) {
    Salario_Neto = Salario_Bruto - (Salario_Bruto*(PorcRete/100));
    return Salario_Neto;
    }

    @Override
    public String toString() {
        return "Empleado\nCodigo_Empleado: " + Codigo_Empleado + "\nNombre: " + Nombre + "\nNumero_Horas_Trabajadas=: " + Numero_Horas_Trabajadas + "\nValor_Hora: " + Valor_Hora + "\nPorcentaje_Retencion: " + Porcentaje_Retencion + "\nSalario Bruto: " + Salario_Bruto + "\nSalario Neto: " + Salario_Neto;
    }

}
