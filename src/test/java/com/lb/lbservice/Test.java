package com.lb.lbservice;

import com.lb.lbservice.service.MailService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类描述：
 * 创建人：yyf
 * 创建时间：2018/11/16 0016下午 11:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

//    @Autowired
//    private JavaMailSender mailSender;
//
//    @org.junit.Test
//    public void sendSimpleMail() throws Exception {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("hr@lebbay.com");
//        message.setTo("1025550955@qq.com");
//        message.setSubject("主题：简单邮件");
//        message.setText("ssssssss");
//
//        mailSender.send(message);
//    }

//    @Autowired
//    MailService mailService;
//
//    @org.junit.Test
//    public void send() throws Exception {
//        String contentStr = sendResultlistHtml();
//        mailService.sendHtmlMail("1025550955@qq.com","【乐贝招聘】邀请您完善简历",contentStr);
//    }
//
//
//    public static String sendResultlistHtml(){
//        StringBuilder p=new StringBuilder();
//        p.append("<p>尊敬的推荐人/候选人:</p>");
//        p.append("<p>");
//        p.append("考核浮动总分："+111);
//        p.append("</p>");
//        p.append("<p>");
//        p.append("271总排序："+222);
//        p.append("</p>");
//        p.append("<p>");
//        p.append("绩效评语："+333);
//        p.append("</p>");
//        p.append("<p>");
//        p.append("感谢您为公司做出的贡献，请继续努力。");
//        p.append("</p>");
//        p.append("<p>");
//        p.append("备注：表中信息如有疑问，请联系您所在事业部的HR。");
//        p.append("</p>");
//
//        return p.toString();
//    }

}
