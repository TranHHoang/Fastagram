
import dao.DatabaseDao;
import dao.context.DBContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Message;
import models.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LEGION
 */
public class Test {

    public static void main(String[] args) {
        try {
            DatabaseDao dao = DatabaseDao.getInstance(DBContext.getInstance());
            System.out.println("is admin exist in the online user :"+dao.isUserOnline("admin"));
            
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
