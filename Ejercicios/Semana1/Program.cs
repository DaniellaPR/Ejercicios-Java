using System;
using System.CodeDom;

namespace Sobrecarga_operador_
{
    class caracteres
    {
        string Nombre;
        public caracteres(string nombre)
        {
            Nombre = nombre;
        }
        public static caracteres operator +(caracteres a, caracteres b)
        {
            caracteres resultado = new caracteres(a.Nombre + " y " + b.Nombre);
            return resultado;
        }
        public static caracteres operator +(caracteres a, int num)
        {
            caracteres resultado = new caracteres(a.Nombre + " o " + num);
            return resultado;
        }
        public override string ToString()
        {
            return Nombre;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            caracteres a = new caracteres("una vaca");
            caracteres b = new caracteres("un pollo");
            caracteres resultado = a + b;
            caracteres resultado2 = a + 2;
            Console.WriteLine(resultado);
            Console.WriteLine(resultado2);
            Console.ReadKey();
        }
    }
}
