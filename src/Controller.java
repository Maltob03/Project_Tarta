import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class Controller {

    private Component frame;

    public void authenticationPerform(String id, LoginFrame login) {
        boolean getPermission = false;
        LoginDAO cerca = new LoginDAO();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean dipendenteIsPresent = cerca.cercaDipendente(id);

        if (dipendenteIsPresent == true) {
            char x = id.charAt(0);
            if (x == 'M') {
                getPermission = true;
                login.setVisible(false);
                new MainFrame(getPermission).setVisible(true);
            } else {
                getPermission = false;
                login.setVisible(false);
                new MainFrame(getPermission).setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(this.frame, "Dipendente non presente", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    public Tartaruga fillTartaruga(String nome, String targhetta, int sede, int vasca) {
        Tartaruga tartarugaController = new Tartaruga();
        tartarugaController.setNome(nome);
        tartarugaController.setTarghetta(targhetta);
        tartarugaController.setSede(sede);
        tartarugaController.setVasca(vasca);

        return tartarugaController;

    }

    public StatoSaluteModel fillValutazione(int testa, int occhi, int naso, int becco, int collo, int pinne, int coda) {
        StatoSaluteModel compilazione = new StatoSaluteModel();

        compilazione.setTesta(testa);
        compilazione.setOcchi(occhi);
        compilazione.setNaso(naso);
        compilazione.setBecco(becco);
        compilazione.setCollo(collo);
        compilazione.setPinne(pinne);
        compilazione.setCoda(coda);

        return compilazione;

    }

    public void cercaTartaruga(String id) {
        ViewTartarugaDAO viewTartaDAO = new ViewTartarugaDAO();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            viewTartaDAO.cercaTartaruga(id);
        }
    }

    public boolean cercaTarghetta(String id) {
        CercaTarghettaDAO cercaEtichetta = new CercaTarghettaDAO();
        boolean reinsert = false;
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this.frame, "Inserisci un ID", "Errore", JOptionPane.ERROR_MESSAGE);
            return reinsert;
        } else {
            reinsert = cercaEtichetta.CercaTarghettaDAO(id);
        }
        return reinsert;
    }

    public CartellaClinicaModel fillCartellaClinica(String specie, int lunghezza, int larghezza, int peso, String luogo,
            String data) {
        CartellaClinicaModel cartellaController = new CartellaClinicaModel();
        cartellaController.setSpecie(specie);
        cartellaController.setLunghezza(lunghezza);
        cartellaController.setLarghezza(larghezza);
        cartellaController.setPeso(peso);
        cartellaController.setLuogo(luogo);
        cartellaController.setData(data);

        return cartellaController;

    }

    public void goToSearch(JButton button1, JButton button2, JButton button3, JButton button5, SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            MainFrame mainFrame) {
        button1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button2.setBorder(null);
        button3.setBorder(null);
        button5.setBorder(null);
        mainFrame.remove(panel2);
        mainFrame.remove(panel3);
        mainFrame.remove(panel4);
        mainFrame.remove(panel5);
        mainFrame.remove(panel6);
        mainFrame.remove(panel7);
        mainFrame.add(panel1, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToInsert(JButton button1, JButton button2, JButton button3, JButton button5, SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            MainFrame mainFrame) {
        button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button1.setBorder(null);
        button3.setBorder(null);
        button5.setBorder(null);
        mainFrame.remove(panel1);
        mainFrame.remove(panel3);
        mainFrame.remove(panel4);
        mainFrame.remove(panel5);
        mainFrame.remove(panel6);
        mainFrame.remove(panel7);
        mainFrame.add(panel2, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToReinsert(JButton button1, JButton button2, JButton button3, JButton button5, SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            MainFrame mainFrame) {
        button5.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button1.setBorder(null);
        button3.setBorder(null);
        button2.setBorder(null);
        mainFrame.remove(panel1);
        mainFrame.remove(panel3);
        mainFrame.remove(panel2);
        mainFrame.remove(panel4);
        mainFrame.remove(panel5);
        mainFrame.remove(panel6);
        mainFrame.remove(panel7);
        mainFrame.add(panel6, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToStatistics(JButton button1, JButton button2, JButton button3, JButton button5, SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            MainFrame mainFrame) {
        button3.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button1.setBorder(null);
        button2.setBorder(null);
        button5.setBorder(null);
        mainFrame.remove(panel1);
        mainFrame.remove(panel2);
        mainFrame.remove(panel4);
        mainFrame.remove(panel5);
        mainFrame.remove(panel6);
        mainFrame.remove(panel7);
        mainFrame.add(panel3, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToInsertCartellaClinica(JButton button1, JButton button2, JButton button3, JButton button5,
            SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            MainFrame mainFrame) {
        button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button1.setBorder(null);
        button3.setBorder(null);
        mainFrame.remove(panel2);
        mainFrame.remove(panel3);
        mainFrame.remove(panel6);
        mainFrame.remove(panel7);
        mainFrame.add(panel4, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToReinsertTarta(JButton button1, JButton button2, JButton button3, JButton button5,
            SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            MainFrame mainFrame) {
        button5.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button1.setBorder(null);
        button3.setBorder(null);
        mainFrame.remove(panel2);
        mainFrame.remove(panel3);
        mainFrame.remove(panel4);
        mainFrame.remove(panel6);
        mainFrame.add(panel7, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToReinsertCartellaClinica(JButton button2, JButton button3, JButton button5,
            SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7, InsertCartellaClinicaPanel panel8,
            MainFrame mainFrame) {
        button5.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
        button3.setBorder(null);
        mainFrame.remove(panel2);
        mainFrame.remove(panel3);
        mainFrame.remove(panel4);
        mainFrame.remove(panel7);
        mainFrame.add(panel8, BorderLayout.CENTER);
        mainFrame.revalidate();
        mainFrame.repaint();

    }

    public void goToInsertStatoSalute(boolean getPermission, JButton button1, JButton button2, JButton button3,
            SearchPanel panel1,
            InsertTartarugaPanel panel2, SearchResultPanel panel3, InsertCartellaClinicaPanel panel4,
            InsertValutazionePanel panel5, ReinserimentoPanel1 panel6, InsertTartarugaPanel panel7,
            InsertCartellaClinicaPanel panel8,
            MainFrame mainFrame) {
        if (getPermission == true) {
            button2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.textHighlight));
            button1.setBorder(null);
            button3.setBorder(null);
            mainFrame.remove(panel2);
            mainFrame.remove(panel3);
            mainFrame.remove(panel4);
            mainFrame.remove(panel6);
            mainFrame.remove(panel7);
            mainFrame.remove(panel8);
            mainFrame.add(panel5, BorderLayout.CENTER);
            mainFrame.revalidate();
            mainFrame.repaint();
        } else {
            JOptionPane.showMessageDialog(this.frame, "Non hai i permessi per inserire la scheda di valutazione",
                    "Errore", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void goToViewCartellaClinica(SearchResultPanel panel1,
            ViewCartellaClinicaPanel panel2, ViewStatoSalutePanel panel3, ViewResultFrame viewResultFrame) {
        viewResultFrame.remove(panel1);
        viewResultFrame.add(panel2, BorderLayout.CENTER);
        viewResultFrame.revalidate();
        viewResultFrame.repaint();

    }

    public void goToViewStatoSalute(SearchResultPanel panel1,
            ViewCartellaClinicaPanel panel2, ViewStatoSalutePanel panel3, ViewResultFrame viewResultFrame) {
        viewResultFrame.remove(panel2);
        viewResultFrame.add(panel3, BorderLayout.CENTER);
        viewResultFrame.revalidate();
        viewResultFrame.repaint();

    }

    public void clearTextField(JTextField textField) {
        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                textField.setText("");
            }

            public void focusLost(FocusEvent e) {
            }
        });
    }

    public void clearTextFieldReinsert(JTextField textField, boolean reinsert) {
        if (reinsert == true) {
            System.out.println(reinsert);

            textField.addFocusListener(new FocusListener() {
                public void focusGained(FocusEvent e) {
                	textField.setText("Prova ad editarmi se hai il coraggio");
                    textField.setEditable(false);
                }

                public void focusLost(FocusEvent e) {
                	textField.setText("Bravo, scappa");
                    textField.setEditable(false);
                }
            });
        } else {
            textField.addFocusListener(new FocusListener() {
                public void focusGained(FocusEvent e) {
                    textField.setText("");
                }

                public void focusLost(FocusEvent e) {
                }

            });
            System.out.println("STO in ELSE");
        }

    }

}
