/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;



/**
 *
 * @author Hieu Trung
 */
public class Test {
    public static void sendmail() {
        try {
            Email email = new SimpleEmail();

            // Cấu hình thông tin Email Server
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("ncthanh239@gmail.com", "nguyenchithanh"));

            // Với gmail cái này là bắt buộc.
            email.setSSLOnConnect(true);

            // Người gửi
            email.setFrom("ncthanh239@gmail.com", "Nguyễn Chí Thành");

            // Tiêu đề
            email.setSubject("EMAIL RESET PASSWORD"); //Tiêu đề khi gửi email

            // Nội dung email
            
            email.setMsg("NGUYỄN CHÍ THÀNH" 
                    + "" + rand()); //Nội dung email bạn muốn gửi.
            // Người nhận
            email.addTo("michellenguyen239@gmail.com"); //Đia chỉ email người nhận
            email.send(); //Thực hiện gửi.
            System.err.println("Sent Email Successfull ! Check youremail, please !");
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Gửi không thành công !");
        }
       
    }
     public static int rand() {
        try {
            Random rn = new Random();
            int range = 9000 - 1000 + 1;
            int randomNum = 1000 + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static void main(String[] args) {
        sendmail();
        
        
    }
}
