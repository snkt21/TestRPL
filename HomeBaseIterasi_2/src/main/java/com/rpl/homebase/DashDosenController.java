package com.rpl.homebase;

import com.rpl.homebase.data.JadwalData;
import com.rpl.homebase.model.Jadwal;
import com.rpl.homebase.model.User;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author SuryaNKT
 */
public class DashDosenController implements Initializable {

    private User sessionUser;
    
    @FXML
    private Label lblAdmin;
    @FXML
    private AnchorPane dashDosen;
    @FXML
    private TableColumn<Jadwal, String> colKode;
    @FXML
    private TableColumn<Jadwal, String> colMakul;
    @FXML
    private TableColumn<Jadwal, String> colHari;
    @FXML
    private TableView<Jadwal> tvJadwal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        UserSession session = UserSession.getInstace(this.sessionUser);
        this.sessionUser = session.getUser();
        lblAdmin.setText(sessionUser.getName());
        
        try {
            showJadwal();
        } catch (SQLException ex) {
            Logger.getLogger(DashDosenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public void showJadwal() throws SQLException{
        JadwalData jadwalData = new JadwalData();
        ObservableList<Jadwal> list = jadwalData.getDataJadwalList();
        
        colMakul.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("makulNama"));
        colKode.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("makulCode"));
        colHari.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("hari"));
        
        tvJadwal.setItems(list);
    }

    @FXML
    private void click(MouseEvent event) {
    }

    @FXML
    private void btnLogout(ActionEvent event) throws IOException {
        SwitchPane sp = new SwitchPane();
        sp.switchPane(dashDosen,"login");
        UserSession session = UserSession.getInstace(this.sessionUser);
        session.cleanUserSession();
    }

    @FXML
    private void btnJadwal(ActionEvent event) {
        
    }

    @FXML
    private void btnPresensi(ActionEvent event) throws IOException {
        SwitchPane sp = new SwitchPane();
        sp.switchPane(dashDosen,"dashDosenPresensi");
    }
}