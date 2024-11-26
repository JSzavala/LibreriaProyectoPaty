package libreria.Procesamiento;

import java.io.*;
import java.util.ArrayList;

public class ManejadorArchivos {

    public static ArrayList<Object> leerArchivo(String archivo) throws ClassNotFoundException {
        ArrayList<Object> objetos = new ArrayList<>();
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            Object objeto;

            while ((objeto = ois.readObject()) != null) {
                objetos.add(objeto);
            }

            return objetos;
        } catch (EOFException ex) {
            return objetos;
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    public static Object leerObjeto(String archivo, int numObjeto) throws ClassNotFoundException {
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            Object objeto = null;

            for (int i = 0; i <= numObjeto; i++) {
                objeto = ois.readObject();
            }

            return objeto;
        } catch (FileNotFoundException | EOFException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    public static ArrayList<Object> reemplazarObjeto(String archivo, int numObjeto, Object nuevoObjeto) throws ClassNotFoundException {
        ArrayList<Object> objetos = leerArchivo(archivo);
        objetos.set(numObjeto, nuevoObjeto);
        ObjectOutputStream escritor = null;

        try {
            escritor = new ObjectOutputStream(new FileOutputStream(archivo));

            for (Object objeto : objetos) {
                escritor.writeObject(objeto);
            }

            return objetos;
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (Exception ex) {
                return null;
            }
        }
    }

    public static ArrayList<Object> agregarObjeto(String archivo, Object nuevoObjeto) throws ClassNotFoundException {
        ObjectOutputStream escritor = null;

        try {
            ArrayList<Object> objetos = leerArchivo(archivo);

            if (objetos == null) {
                objetos = new ArrayList<>();
            }

            objetos.add(nuevoObjeto);
            File flArchivo = new File(archivo);

            if (flArchivo.length() > 0) {
                escritor = new ObjectOutputStreamSinHeader(new FileOutputStream(flArchivo, true));
            } else {
                escritor = new ObjectOutputStream(new FileOutputStream(flArchivo, true));
            }

            escritor.writeObject(nuevoObjeto);
            return objetos;
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (Exception ex) {
                return null;
            }
        }
    }

    public static ArrayList<Object> eliminarObjeto(String archivo, int numObjeto) throws ClassNotFoundException {
        ObjectOutputStream escritor = null;

        try {
            ArrayList<Object> objetos = leerArchivo(archivo);
            objetos.remove(numObjeto);
            escritor = new ObjectOutputStream(new FileOutputStream(archivo));

            for (Object objeto : objetos) {
                escritor.writeObject(objeto);
            }

            
            return objetos;
        } catch (IOException ex) {
            return null;
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException ex) {
                return null;
            }
        }
    }
}
