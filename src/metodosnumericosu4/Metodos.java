package metodosnumericosu4;

import java.util.ArrayList;
import org.nfunk.jep.*;

/**
 *
 * @author Juan Carlos Estrella
 */
public class Metodos {

    double resultadoTrapecioMultiple, resultadoSimpsonTercioMultiple;

    public String metodoTrapecio(String a, String b, String funcion) {
        String cadena = null;

        JEP obj = new JEP();
        obj.addStandardFunctions();//Adiciona funciones matemáticas
        obj.addStandardConstants();//Adiciona las contantes matemáticas (e, pi)
        obj.setImplicitMul(true);//Interpreta las funciones

        obj.parseExpression(a);//Convierte "a" a double
        double limInf = obj.getValue();//Almacena el valor del limite inferior

        obj.parseExpression(b);//Convierte "b" a double
        double limSup = obj.getValue();//Almacena el valor del limite superior

        double h = (limSup - limInf) / 2;

        double evA = obj.addVariable("x", limInf);
        obj.parseExpression(funcion);//Pasa la expresion a evaluar
        evA = obj.getValue();

        double evB = obj.addVariable("x", limSup);
        obj.parseExpression(funcion);
        evB = obj.getValue();

        double I = h * (evA + evB);
        cadena = Double.toString(I);

        return cadena;
    }

    public ArrayList<FilaTrapecioMultiple> metodoTrapecioMultiple(String a, String b, int n, String funcion) {
        double H[] = new double[n + 1];
        double aih[] = new double[n + 1];
        double faih[] = new double[n + 1];
        ArrayList<FilaTrapecioMultiple> lista = new ArrayList<FilaTrapecioMultiple>();
        JEP obj = new JEP();
        obj.addStandardFunctions();//Adiciona funciones matemáticas
        obj.addStandardConstants();//Adiciona las contantes matemáticas (e, pi)
        obj.setImplicitMul(true);//Interpreta las funciones

        obj.parseExpression(a);//Convierte "a" a double
        double limInf = obj.getValue();//Almacena el valor del limite inferior

        obj.parseExpression(b);//Convierte "b" a double
        double limSup = obj.getValue();//Almacena el valor del limite superior

        double h = (limSup - limInf) / n, acum = 0;

        for (int i = 0; i <= n; i++) {
            FilaTrapecioMultiple fila = new FilaTrapecioMultiple();
            fila.setI(i);
            H[i] = h;
            aih[i] = (limInf + i * h);
            double evAih = obj.addVariable("x", (limInf + i * h));
            obj.parseExpression(funcion);
            evAih = obj.getValue();
            faih[i] = evAih;
            fila.setH(H[i]);
            fila.setAih(aih[i]);
            fila.setFaih(faih[i]);
            lista.add(fila);

        }
        for (int j = 1; j < n; j++) {
            acum += faih[j];
        }
        double evA = obj.addVariable("x", limInf);
        obj.parseExpression(funcion);
        evA = obj.getValue();
        double evB = obj.addVariable("x", limSup);
        obj.parseExpression(funcion);
        evB = obj.getValue();
        this.resultadoTrapecioMultiple = (h / 2) * (evA + (2 * acum) + evB);
        return lista;
    }

    public String metodoSimpsonTercio(String a, String b, String funcion) {
        String cadena = null;

        JEP obj = new JEP();
        obj.addStandardFunctions();//Adiciona funciones matemáticas
        obj.addStandardConstants();//Adiciona las contantes matemáticas (e, pi)
        obj.setImplicitMul(true);//Interpreta las funciones

        obj.parseExpression(a);//Convierte "a" a double
        double limInf = obj.getValue();//Almacena el valor del limite inferior

        obj.parseExpression(b);//Convierte "b" a double
        double limSup = obj.getValue();//Almacena el valor del limite superior

        double h = (limSup - limInf) / 2, X = (limSup + limInf) / 2;

        double evA = obj.addVariable("x", limInf);
        obj.parseExpression(funcion);//Pasa la expresion a evaluar
        evA = obj.getValue();

        double evB = obj.addVariable("x", limSup);
        obj.parseExpression(funcion);
        evB = obj.getValue();
        
        double evX = obj.addVariable("x", X);
        obj.parseExpression(funcion);
        evX = obj.getValue();

        double I = h/3 * (evA + (4 * evX) +evB);
        cadena = Double.toString(I);

        return cadena;
    }

    public ArrayList<FilaSimpsonTercioMultiple> metodoSimpsonTercioMultiple(String a, String b, int n, String funcion) {
        double H[] = new double[n + 1];
        double aih[] = new double[n + 1];
        double faih[] = new double[n + 1];
        ArrayList<FilaSimpsonTercioMultiple> lista = new ArrayList<FilaSimpsonTercioMultiple>();
        JEP obj = new JEP();
        obj.addStandardFunctions();//Adiciona funciones matemáticas
        obj.addStandardConstants();//Adiciona las contantes matemáticas (e, pi)
        obj.setImplicitMul(true);//Interpreta las funciones

        obj.parseExpression(a);//Convierte "a" a double
        double limInf = obj.getValue();//Almacena el valor del limite inferior

        obj.parseExpression(b);//Convierte "b" a double
        double limSup = obj.getValue();//Almacena el valor del limite superior

        double h = (limSup - limInf) / n, acum = 0, acum1 = 0;

        for (int i = 0; i <= n; i++) {
            FilaSimpsonTercioMultiple fila = new FilaSimpsonTercioMultiple();
            fila.setI(i);
            H[i] = h;
            aih[i] = limInf + (i * h);
            double evAih = obj.addVariable("x", limInf + (i * h));
            obj.parseExpression(funcion);
            evAih = obj.getValue();
            faih[i] = evAih;
            fila.setH(H[i]);
            fila.setAih(aih[i]);
            fila.setFaih(faih[i]);
            lista.add(fila);

        }
        for (int j = 1; j < n; j++) {
            if (j % 2 != 0) {
                acum += faih[j];
            }
        }

        for (int j = 2; j < n - 1; j++) {
            if (j % 2 == 0) {
                acum1 += faih[j];
            }
        }
        
        double evA = obj.addVariable("x", limInf);
        obj.parseExpression(funcion);
        evA = obj.getValue();
        double evB = obj.addVariable("x", limSup);
        obj.parseExpression(funcion);
        evB = obj.getValue();
        this.resultadoSimpsonTercioMultiple = (h / 3) * (evA + (4 * acum) + (2 * acum1) + evB);
        return lista;
    }

}
