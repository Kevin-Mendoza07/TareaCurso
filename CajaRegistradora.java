package TareaDeCurso;

import javax.swing.*;
import java.util.Scanner;

/*Integrantes de la tarea:
-Kevin Mendoza, Jasser Romero,Juan Morales,Oscar Garcia y Leandro
 */
/*NOTA: EL USUARIO DE LA CAJA ES admin Y LA CONTRASEÑA ES contra123  */
public class CajaRegistradora {

    public static void main(String[] args) {

        /*NOTA: EL USUARIO DE LA CAJA ES admin Y LA CONTRASEÑA ES contra123  */
        Scanner lector = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        String nombre="", contra="";
        int Existencias = 0;
        int cantidadProducto = 0, cantidadUsuario=0;
        int contador=0, auxiliar2=0;
        double Monto = 0, auxiliar=0, MontoTotal=0;
        String[] presentacionFactura = {"Cédula: ", "Nombre: ", "Apellido: ", "Producto: ", "Cantidad: ", "Monto: "};
        String eleccion;
        int op,op2,op3;
        int aum = 0;
        int acum = 0;
        String[][] Productos = new String[20][7];
        String[] datos = {"Codigo: ", "Nombre: ", "Descripcion: ", "Marca/Fabricante/Proveedor: ", "Precio de compra: ",
                "P.V.P: ", "Cantidad en existencia: "};
        String[][] clientes = new String[20][5];
        String[] presentacion = {"Numero de cedula: ", "Nombre: ", "Apellido: ", "Numero de telefono: ", "Direccion: "};
        String cedula, nombreCliente, apellido,direccion;
        int numtelef;

        do {

            nombre = JOptionPane.showInputDialog(null, "\tBienvenido \nUsuario: ");
            contra = JOptionPane.showInputDialog(null, "Contraseña: ");
            if (nombre.equals("admin") && contra.equals("contra123")) {
                JOptionPane.showMessageDialog(null, "Bienvenida Mirna");
                do {
                    System.out.println("Caja Registradora");
                    System.out.println("------MENU------");
                    System.out.println("1. Clientes");
                    System.out.println("2. Productos");
                    System.out.println("3. Nueva Transaccion");
                    System.out.println("4. Informe de caja");
                    System.out.println("5. Salir del sistema");
                    System.out.println("----------------------");
                    System.out.println("Ingrese una opcion: ");
                    op = lector.nextInt();

                    switch(op){
                        case 1:
                            do {
                                System.out.println("-------OPCIONES-----");
                                System.out.println("1. Nuevo Cliente");
                                System.out.println("2. Ver lista completa de clientes");
                                System.out.println("3. Buscar cliente");
                                System.out.println("4. Eliminar");
                                System.out.println("5. Volver");
                                System.out.println("----------------------------");
                                System.out.println("Ingrese una opcion: ");
                                op2 = lector.nextInt();

                                switch (op2) {
                                    case 1:
                                        if (op == 1) {
                                            aum += 1;
                                            int i;
                                            for (i = aum - 1; i < aum; i++) {
                                                for (int j = 0; j < 5; j++) {

                                                    switch (j) {
                                                        case 0:
                                                            System.out.println("Ingrese el numero de cedula: ");
                                                            clientes[i][j] = entrada.next();
                                                            continue;

                                                        case 1:
                                                            System.out.println("Ingrese el nombre: ");
                                                            clientes[i][j] = entrada.next();

                                                            continue;

                                                        case 2:
                                                            System.out.println("Ingrese el apellido: ");
                                                            clientes[i][j] = entrada.next();

                                                            continue;

                                                        case 3:
                                                            System.out.println("Ingrese el numero de telefono: ");
                                                            clientes[i][j] = entrada.next();

                                                            continue;

                                                        case 4:
                                                            System.out.println("Ingrese la dirección: ");
                                                            clientes[i][j] = entrada.next();

                                                            System.out.println("\nC L I E N T E   R E G I S T R A D O\n");

                                                    }

                                                }


                                            }
                                        } else {
                                            continue;
                                        }
                                        continue;

                                    case 2:
                                        for (int i = 0; i < aum; i++) {
                                            for (int j = 0; j < 5; j++) {

                                                System.out.format("%3s %3s\n", presentacion[j], clientes[i][j]);

                                            }
                                            System.out.println();
                                        }
                                        continue;
                                    case 3:
                                        System.out.println("Ingrese el numero de cedula: ");
                                        String cedulabusqueda = entrada.next();
                                        System.out.println();

                                        int posicion = 0;
                                        int fila = 0;
                                        int columna = 0;
                                        int cont = 0;

                                        for (int i = 0; i < aum; i++) {
                                            if (cedulabusqueda.equals(clientes[i][0])) {
                                                fila = i;
                                                cont = 1;
                                            }
                                        }
                                        if (cont == 0) {
                                            System.out.println("No se encontro el cliente buscado");
                                        } else {
                                            for (int j = 0; j < 5; j++) {
                                                System.out.format("%3s %3s\n", presentacion[j], clientes[fila][j]);
                                            }
                                            System.out.println();
                                        }
                                        continue;
                                    case 4:
                                        fila = 0;
                                        System.out.println("Ingrese el numero de cedula: ");
                                        cedulabusqueda = entrada.next();

                                        for (int i = 0; i < aum; i++) {
                                            if (cedulabusqueda.equals(clientes[i][0])) {
                                                fila = i;
                                            }
                                        }


                                        for (int j = 0; j < 5; j++) {

                                            clientes[fila][j] = "";
                                            presentacion[j] = "";


                                        }

                                        System.out.println("El cliente ha sido borrado del sistema");
                                        System.out.println();

                                        continue;
                                    case 5:
                                        System.out.println("Regresará al menú principal");
                                        break;
                                    default:
                                        System.out.println("Ha elegido una opción equivocada, vuelva a intentarlo");
                                        break;
                                }

                                break;
                            }while (op2 != 5);
                            continue;

                        case 2:
                            do {
                                System.out.println("-------OPCIONES-------");
                                System.out.println("1. Nuevo producto");
                                System.out.println("2. Ver lista completa de productos");
                                System.out.println("3. Buscar producto");
                                System.out.println("4. Eliminar");
                                System.out.println("5. Volver");
                                System.out.println("-------------------------------");
                                System.out.println("Ingrese una opcion: ");
                                op3 = lector.nextInt();

                                switch (op3) {
                                    case 1:
                                        if (op3 == 1) {
                                            acum += 1;
                                            int i;
                                            for (i = acum - 1; i < acum; i++) {
                                                for (int j = 0; j < 7; j++) {
                                                    switch (j) {
                                                        case 0:
                                                            System.out.println("Ingrese el codigo: ");
                                                            Productos[i][j] = lector.next();
                                                            continue;

                                                        case 1:
                                                            System.out.println("Ingrese el nombre:");
                                                            Productos[i][j] = lector.next();
                                                            continue;

                                                        case 2:
                                                            System.out.println("Ingrese la descripcion: ");
                                                            Productos[i][j] = lector.next();
                                                            continue;

                                                        case 3:
                                                            System.out.println("Ingrese la marca/fabricante/proveedor: ");
                                                            Productos[i][j] = lector.next();
                                                            continue;

                                                        case 4:
                                                            System.out.println("Ingrese el precio de compra: ");
                                                            Productos[i][j] = lector.next();
                                                            continue;

                                                        case 5:
                                                            System.out.println("Ingrese P.V.P(Precio de venta al publico): ");
                                                            Productos[i][j] = lector.next();
                                                            continue;

                                                        case 6:
                                                            System.out.println("Ingrese la cantidad en existencia: ");
                                                            Productos[i][j] = lector.next();

                                                            System.out.println("\nP R O D U C T O  R E G I S T R A D O\n");

                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                        continue;
                                    case 2:
                                        for (int i = 0; i < acum; i++) {
                                            for (int j = 0; j < 7; j++) {
                                                System.out.format("%3s %3s\n", datos[j], Productos[i][j]);
                                            }
                                            System.out.println();
                                        }
                                        continue;
                                    case 3:
                                        System.out.println("Ingrese el codigo del producto: ");
                                        String codigobusqueda = lector.next();
                                        System.out.println();

                                        int posicion = 0;
                                        int fila = 0;
                                        int columna = 0;
                                        int cont = 0;

                                        for (int i = 0; i < acum; i++) {
                                            if (codigobusqueda.equals(Productos[i][0])) {
                                                fila = i;
                                                cont = 1;
                                            }
                                        }
                                        if (cont == 0) {
                                            System.out.println("No se encontro el producto buscado");
                                        } else {
                                            for (int j = 0; j < 7; j++) {
                                                System.out.format("%3s %3s\n", datos[j], Productos[fila][j]);
                                            }
                                            System.out.println();
                                        }
                                        continue;
                                    case 4:
                                        fila = 0;
                                        System.out.println("Ingrese el codigo del producto: ");
                                        codigobusqueda = lector.next();

                                        for (int i = 0; i < acum; i++) {
                                            if (codigobusqueda.equals(Productos[i][0])) {
                                                fila = i;
                                            }
                                        }

                                        for (int j = 0; j < 7; j++) {

                                            Productos[fila][j] = "";
                                            datos[j] = "";
                                        }
                                        System.out.println("El producto ha sido borrado del sistema");
                                        System.out.println();

                                        continue;

                                    case 5:
                                        System.out.println("Regresara al menú principal");
                                        continue;
                                }
                            } while (op3 != 5);
                            continue;

                        case 3:
                            do {
                                System.out.println("\t\n======NUEVA TRANSACCION======");
                                System.out.println("Ingrese el numero de cédula: ");
                                String cedulabusqueda = entrada.next();
                                System.out.println();

                                int posicion = 0;
                                int fila = 0;
                                int columna = 0;
                                int cont = 0;

                                for (int i = 0; i < aum; i++) {
                                    if (cedulabusqueda.equals(clientes[i][0])) {
                                        fila = i;
                                        cont = 1;

                                    }
                                }
                                if (cont == 0) {
                                    System.out.println("El cliente no está registrado");
                                    System.out.println("Proceda a registrarse");
                                    aum += 1;
                                    int i;
                                    for (i = aum - 1; i < aum; i++) {
                                        for (int j = 0; j < 5; j++) {

                                            switch (j) {
                                                case 0:
                                                    System.out.println("Ingrese nuevamente el numero de cedula: ");
                                                    clientes[i][j] = entrada.next();
                                                    continue;

                                                case 1:
                                                    System.out.println("Ingrese el nombre: ");
                                                    clientes[i][j] = entrada.next();

                                                    continue;

                                                case 2:
                                                    System.out.println("Ingrese el apellido: ");
                                                    clientes[i][j] = entrada.next();

                                                    continue;

                                                case 3:
                                                    System.out.println("Ingrese el numero de telefono: ");
                                                    clientes[i][j] = entrada.next();

                                                    continue;

                                                case 4:
                                                    System.out.println("Ingrese la dirección: ");
                                                    clientes[i][j] = entrada.next();

                                                    System.out.println("\nC L I E N T E   R E G I S T R A D O\n");


                                            }


                                        }
                                    }
                                }
                                System.out.println("Ingrese el código del producto que se desea comprar:");
                                String codigobusqueda = entrada.next();

                                if (contador > 0) {
                                    auxiliar2 = cantidadProducto;
                                }

                                System.out.println("Ingrese la cantidad que se llevará de dicho producto:");
                                cantidadUsuario = entrada.nextInt();


                                cantidadProducto = cantidadUsuario;


                                if (contador > 0) {
                                    cantidadProducto += auxiliar2;
                                }

                                for (int i = 0; i < acum; i++) {
                                    if (codigobusqueda.equals(Productos[i][0])) {
                                        fila = i;
                                        cont = 1;
                                        Existencias = Integer.parseInt(Productos[i][6]);
                                        Monto = Double.parseDouble(Productos[i][5]);
                                    } else {
                                        cont = 0;
                                    }
                                }

                                if (contador > 0) {
                                    auxiliar = MontoTotal;
                                }
                                MontoTotal = Monto * cantidadProducto;

                                if (contador > 0) {
                                    MontoTotal += auxiliar;
                                }


                                if (cont == 0) {
                                    System.out.println("No se encontró el producto buscado, elija de nuevo");
                                } else if (Existencias < cantidadUsuario || Existencias < 1) {
                                    System.out.println("A G O T A D O");
                                } else {
                                    System.out.println("\t\n ==== F A C T U R A ==== \t");
                                    for (int i = 0; i < aum; i++) {
                                        for (int j = 0; j < 6; j++) {

                                            if (j < 3) {

                                                System.out.println(presentacionFactura[j] + " " + clientes[i][j]);
                                            } else if (j == 3) {
                                                System.out.println(presentacionFactura[j] + " " + Productos[i][1]);
                                            } else if (j == 4) {
                                                System.out.println(presentacionFactura[j] + " " + cantidadProducto);
                                            } else if (j == 5) {
                                                System.out.println(presentacionFactura[j] + " " + MontoTotal + " $");
                                            }

                                        }
                                        System.out.println();
                                    }
                                }
                                contador++;
                                if (cont != 0) {
                                    Existencias -= cantidadProducto;
                                }
                                System.out.println("¿Realizara otra transacción? (S/N)");
                                eleccion = entrada.next();
                            } while (eleccion.equals("S") || eleccion.equals("s"));
                            continue;

                        case 4:
                            double ContDinero=0;

                            System.out.println("\t\n <<<<< INFORME DE CAJA >>>>> \t");
                            for (int i = 0; i < aum; i++) {
                                for (int j = 0; j < 6; j++) {

                                    if ( j < 3 ) {

                                        System.out.println("El Cliente: " + clientes[ i ][ j ]);

                                    } else if ( j == 3 ) {
                                        System.out.println("Realizo la compra de: " + Productos[ i ][ 1 ]);
                                    } else if ( j == 4 ) {
                                        System.out.println("Por: " + cantidadProducto);
                                    } else if ( j == 5 ) {
                                        System.out.println("Agregando una cantidad de: " + MontoTotal + " $. a la Caja");
                                        ContDinero=ContDinero+MontoTotal;
                                        System.out.println("La Suma Completa de Efectivo Agregada a Caja es de: "+ContDinero+" $.");
                                    }
                                }
                            }
                            continue;

                        case 5:
                            System.out.println("Gracias por utilizar la caja registradora, vuelva pronto!!");
                            break;
                    }
                }while (op != 5);
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Usuario No registrado");
            }
        }while(nombre.equals("admin")==false||contra.equals("123")==false);

    }
}