/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTVN;

import java.util.Random;

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
            email.setAuthenticator(new DefaultAuthenticator("michellenguyen239@gmail.com", "hieu2309"));

            // Với gmail cái này là bắt buộc.
            email.setSSLOnConnect(true);

            // Người gửi
            email.setFrom("michellenguyen239@gmail.com", "Nguyễn Chí Thành");

            // Tiêu đề
            email.setSubject("EMAIL RESET PASSWORD"); //Tiêu đề khi gửi email

            // Nội dung email
            
            email.setMsg("NGUYỄN CHÍ THÀNH 23091998 " 
                    + ""); //Nội dung email bạn muốn gửi.
            // Người nhận
            email.addTo("truongtuyetnghenhzxy@gmail.com"); //Đia chỉ email người nhận
            email.send(); //Thực hiện gửi.
            System.err.println("Sent Email Successfull ! Check youremail, please !");
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Gửi không thành công !");
        }
       
    }
     public int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
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
