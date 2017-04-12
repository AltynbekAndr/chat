package com.plan.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;


@Controller
public class MessageController {


    @RequestMapping(value = "a/b/c/uploadFile1", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile1(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String name = null;
        String postname = null;
        String text = null;

        postname = request.getParameter("postname");

        text = request.getParameter("text");

        if (postname != null && text != null) {
            File f = new File("page\\");
            f.mkdir();

            File f2 = new File("page\\postname.txt");
            File f3 = new File("page\\text.txt");
            String strpostname = postname;
            String strtxt = text;
            try {
                f2.createNewFile();
                f3.createNewFile();

                FileWriter fw = new FileWriter(f2, false);
                fw.write(strpostname);
                FileWriter fw2 = new FileWriter(f3, false);
                fw2.write(strtxt);

                fw.flush();
                fw2.flush();
            } catch (IOException ex) {
            }
        }

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                name = file.getOriginalFilename();

                String rootPath = "path\\";  //try also "C:\path\"
                File dir = new File(rootPath + File.separator + "loadFiles");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + "1.jpg");

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();


                return "STAT'YA " + postname + "USPESHNO OPUBLIKOVAN :-)))))";

            } catch (Exception e) {
                return "OSHIBKA ZAGRUZKI FOTO :-(((((((((((" + name + " => " + e.getMessage();
            }
        } else {
            return "FAIL NE ZAGRUJEN" + name + "ON NE DOLJNO BYT' PUSTYM!!!!!!!!! ";
        }
    }

    @RequestMapping(value = "a/b/c/uploadFile2", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile2(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String name = null;
        String postname = null;
        String text = null;

        postname = request.getParameter("postname");

        text = request.getParameter("text");

        if (postname != null && text != null) {
            File f = new File("page2\\");
            f.mkdir();

            File f2 = new File("page2\\postname.txt");
            File f3 = new File("page2\\text.txt");
            String strpostname = postname;
            String strtxt = text;
            try {
                f2.createNewFile();
                f3.createNewFile();

                FileWriter fw = new FileWriter(f2, false);
                fw.write(strpostname);
                FileWriter fw2 = new FileWriter(f3, false);
                fw2.write(strtxt);

                fw.flush();
                fw2.flush();
            } catch (IOException ex) {
            }
        }

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                name = file.getOriginalFilename();

                String rootPath = "path\\";  //try also "C:\path\"
                File dir = new File(rootPath + File.separator + "loadFiles");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + "2.jpg");

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();


                return "STAT'YA " + postname + "USPESHNO OPUBLIKOVAN :-)))))";

            } catch (Exception e) {
                return "OSHIBKA ZAGRUZKI FOTO :-(((((((((((" + name + " => " + e.getMessage();
            }
        } else {
            return "FAIL NE ZAGRUJEN" + name + "ON NE DOLJNO BYT' PUSTYM!!!!!!!!! ";
        }
    }

    @RequestMapping(value = "a/b/c/uploadFile3", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile3(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String name = null;
        String postname = null;
        String text = null;

        postname = request.getParameter("postname");

        text = request.getParameter("text");

        if (postname != null && text != null) {
            File f = new File("page3\\");
            f.mkdir();

            File f2 = new File("page3\\postname.txt");
            File f3 = new File("page3\\text.txt");
            String strpostname = postname;
            String strtxt = text;
            try {
                f2.createNewFile();
                f3.createNewFile();

                FileWriter fw = new FileWriter(f2, false);
                fw.write(strpostname);
                FileWriter fw2 = new FileWriter(f3, false);
                fw2.write(strtxt);

                fw.flush();
                fw2.flush();
            } catch (IOException ex) {
            }
        }

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                name = file.getOriginalFilename();

                String rootPath = "path\\";  //try also "C:\path\"
                File dir = new File(rootPath + File.separator + "loadFiles");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + "3.jpg");

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();


                return "STAT'YA " + postname + "USPESHNO OPUBLIKOVAN :-)))))";

            } catch (Exception e) {
                return "OSHIBKA ZAGRUZKI FOTO :-(((((((((((" + name + " => " + e.getMessage();
            }
        } else {
            return "FAIL NE ZAGRUJEN" + name + "ON NE DOLJNO BYT' PUSTYM!!!!!!!!! ";
        }
    }


    @RequestMapping(value = "filee", method = RequestMethod.POST)
    @ResponseBody
    public String filee(@RequestParam("file") MultipartFile file) {
        String name = null;

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                name = file.getOriginalFilename();

                String rootPath = "path\\";  //try also "C:\path\"
                File dir = new File(rootPath + File.separator + "loadFiles");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + "2.mp4");

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();


                return "STAT'YA " + name + "USPESHNO OPUBLIKOVAN :-)))))";

            } catch (Exception e) {
                return "OSHIBKA ZAGRUZKI FOTO :-(((((((((((" + name + " => " + e.getMessage();
            }
        } else {
            return "FAIL NE ZAGRUJEN" + name + "ON NE DOLJNO BYT' PUSTYM!!!!!!!!! ";
        }
    }
}