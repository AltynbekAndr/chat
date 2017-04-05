package com.plan.controller;

import com.plan.ModelTxt.ModelTxt;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;


@Controller
@RequestMapping
public class GlavContr {

    @RequestMapping(value = "selhoztehnic", method = RequestMethod.GET)
    public ModelAndView tehnic(HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("tehnic");
        return modelAndView;
    }

    @RequestMapping(value = "torgovayaploshadka", method = RequestMethod.GET)
    public ModelAndView tploshadka(HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("tploshadka");
        return modelAndView;
    }

    @RequestMapping(value = "analitikaiceny", method = RequestMethod.GET)
    public ModelAndView analitik(HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("analitik");
        return modelAndView;
    }

    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public ModelAndView contects(HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("contacts");
        return modelAndView;
    }

    @RequestMapping(value = "a/b/c/admin", method = RequestMethod.GET)
    public ModelAndView admin(HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("admin");
        return modelAndView;
    }

    @RequestMapping(value = "autorizationfs", method = RequestMethod.POST)
    public ModelAndView admin2(HttpServletRequest request, ModelAndView modelAndView) {
        String password = "admin1234554321";
        String name = "admin";
        String p = null, n = null;
        p = request.getParameter("password");
        n = request.getParameter("name");
        if (p.equals(password) && n.equals(name)) {
            modelAndView.setViewName("admin");
            return modelAndView;
        }
        modelAndView.setViewName("error2");
        return modelAndView;
    }

    @RequestMapping(value = "autorization", method = RequestMethod.GET)
    public ModelAndView autorization(ModelAndView modelAndView) {

        modelAndView.setViewName("autorization");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "analitikaicenyajaxphoto", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] analitikaicenyajaxphoto() throws IOException {
        InputStream in = null;

        String rootPath = "path\\";
        File dir = new File(rootPath + File.separator + "loadFiles");
        File f = new File(dir.getAbsolutePath() + File.separator + "1.jpg");
        in = new FileInputStream(f);

        return IOUtils.toByteArray(in);
    }

    @ResponseBody
    @RequestMapping(value = "selhoztehnicajaxphoto", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] selhoztehnicajaxphoto() throws IOException {
        InputStream in = null;
        String rootPath = "path\\";
        File dir = new File(rootPath + File.separator + "loadFiles");
        File f = new File(dir.getAbsolutePath() + File.separator + "2.jpg");
        in = new FileInputStream(f);

        return IOUtils.toByteArray(in);
    }

    @ResponseBody
    @RequestMapping(value = "torgovayaploshadkaajaxphoto", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] torgovayaploshadkaajaxphoto() throws IOException {
        InputStream in = null;
        String rootPath = "path\\";
        File dir = new File(rootPath + File.separator + "loadFiles");
        File f = new File(dir.getAbsolutePath() + File.separator + "3.jpg");
        in = new FileInputStream(f);
        return IOUtils.toByteArray(in);
    }


    @ResponseBody
    @RequestMapping(value = "analitikaicenyajax", method = RequestMethod.GET)
    public Object analitikajax() throws IOException {
        ModelTxt model = null;
        File f = new File("page\\postname.txt");
        File f2 = new File("page\\text.txt");

        InputStream in = new FileInputStream(f);
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(inr);

        InputStream in2 = new FileInputStream(f2);
        InputStreamReader inr2 = new InputStreamReader(in2);
        BufferedReader bf2 = new BufferedReader(inr2);
        String s1 = bf.readLine();
        String s2 = bf2.readLine();
        model = new ModelTxt(s1, s2);


        return model;

    }

    @ResponseBody
    @RequestMapping(value = "selhoztehnicajax", method = RequestMethod.GET)
    public Object tehnicajax() throws IOException {
        ModelTxt model = null;
        File f = new File("page2\\postname.txt");
        File f2 = new File("page2\\text.txt");

        InputStream in = new FileInputStream(f);
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(inr);

        InputStream in2 = new FileInputStream(f2);
        InputStreamReader inr2 = new InputStreamReader(in2);
        BufferedReader bf2 = new BufferedReader(inr2);
        String s1 = bf.readLine();
        String s2 = bf2.readLine();
        model = new ModelTxt(s1, s2);


        return model;

    }

    @ResponseBody
    @RequestMapping(value = "torgovayaploshadkaajax", method = RequestMethod.GET)
    public Object tploshadkaajax() throws IOException {
        ModelTxt model = null;
        File f = new File("page3\\postname.txt");
        File f2 = new File("page3\\text.txt");

        InputStream in = new FileInputStream(f);
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(inr);

        InputStream in2 = new FileInputStream(f2);
        InputStreamReader inr2 = new InputStreamReader(in2);
        BufferedReader bf2 = new BufferedReader(inr2);
        String s1 = bf.readLine();
        String s2 = bf2.readLine();
        model = new ModelTxt(s1, s2);


        return model;

    }















}
