package edu.escuelaing.arep.App;

/**
 * Nicolas
 *
 */
public class App 
{
    public static int clients = 2000;
    public static String url  = "http://52.87.176.226:4567/ordenar?cadena=";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ClientT[] threads = new ClientT[clients];

        for (int i = 0; i < clients; i++) {
            threads[i] = new ClientT(url);
        }
        for (int i = 0; i < clients; i++) {
            threads[i].start();
        }
        for (int i = 0; i < clients; i++) {
            threads[i].join();
        }
        System.out.println("Request finish");
    }
}
