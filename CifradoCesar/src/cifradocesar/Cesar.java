/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

/**
 *
 * @author Javier Snz
 */
public class Cesar {

    private String mensajeSC = "", mensajeC = "";
    private int desplazamiento;

    public Cesar(String mensajeSC, String mensajeC, int desplazamiento) {
        this.mensajeSC = mensajeSC;
        this.mensajeC = mensajeC;
        this.desplazamiento = desplazamiento;
    }

    public Cesar() {
    }

    public String getMensajeSC() {
        return mensajeSC;
    }

    public void setMensajeSC(String mensajeSC) {
        this.mensajeSC = mensajeSC;
    }

    public String getMensajeC() {
        return mensajeC;
    }

    public void setMensajeC(String mensajeC) {
        this.mensajeC = mensajeC;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String cifrar() {

        try {
            StringBuilder cifrado = new StringBuilder();
            desplazamiento = desplazamiento % 26;
            for (int i = 0; i < mensajeSC.length(); i++) {
                if (mensajeSC.charAt(i) == ' ') {
                    cifrado.append(" ");
                }
                
                if (mensajeSC.charAt(i) >= 'a' && mensajeSC.charAt(i) <= 'z') {
                    if ((mensajeSC.charAt(i) + desplazamiento) > 'z') {
                        cifrado.append((char) (mensajeSC.charAt(i) + desplazamiento - 26));
                    } else {
                        cifrado.append((char) (mensajeSC.charAt(i) + desplazamiento));
                    }
                } else if (mensajeSC.charAt(i) >= 'A' && mensajeSC.charAt(i) <= 'Z') {
                    if ((mensajeSC.charAt(i) + desplazamiento) > 'Z') {
                        cifrado.append((char) (mensajeSC.charAt(i) + desplazamiento - 26));
                    } else {
                        cifrado.append((char) (mensajeSC.charAt(i) + desplazamiento));
                    }
                }
            }
            mensajeC = cifrado.toString();
        } catch (Exception e) {
            System.out.println(e);
        }

        return mensajeC;
    }

    public String decifrar() {
        try {
            StringBuilder cifrado = new StringBuilder();
            desplazamiento = desplazamiento % 26;
            for (int i = 0; i < mensajeC.length(); i++) {
                if (mensajeC.charAt(i) == ' ') {
                    cifrado.append(" ");
                }

                if (mensajeC.charAt(i) >= 'a' && mensajeC.charAt(i) <= 'z') {
                    if ((mensajeC.charAt(i) - desplazamiento) < 'a') {
                        cifrado.append((char) (mensajeC.charAt(i) - desplazamiento + 26));
                    } else {
                        cifrado.append((char) (mensajeC.charAt(i) - desplazamiento));
                    }
                } else if (mensajeC.charAt(i) >= 'A' && mensajeC.charAt(i) <= 'Z') {
                    if ((mensajeC.charAt(i) - desplazamiento) < 'A') {
                        cifrado.append((char) (mensajeC.charAt(i) - desplazamiento + 26));
                    } else {
                        cifrado.append((char) (mensajeC.charAt(i) - desplazamiento));
                    }
                }
            }
            mensajeSC = cifrado.toString();

        } catch (Exception e) {
            System.out.println(e);
        }

        return this.mensajeSC;
    }
}
