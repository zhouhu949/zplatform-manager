package com.zlebank.zplatform.manager.action.zleblank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.zlebank.zplatform.manager.action.upload.AbstractFileContentHandler;
import com.zlebank.zplatform.manager.dao.object.BnkTxnModel;

public class ZLFileContent extends AbstractFileContentHandler{
    
    private List<BnkTxnModel> bnkTxnList; 
    
   
    public List<BnkTxnModel> readFile(File[] upload,String instiid, String[] uploadFileName) throws NumberFormatException, IOException{
        
        bnkTxnList=new ArrayList<BnkTxnModel>();
        String newline = "";// 读取一行
        Object[] fileNameob;// 文件名称按照_拆分
        BufferedReader brfile = new BufferedReader(new FileReader(upload[0]));
        int i = 0;
        try {
        while ((newline = brfile.readLine()) != null
                && !newline.equals("")) {
            if (i == 0) {
                i = i + 1;
                continue;
            } else {
                BnkTxnModel bnk = new BnkTxnModel();
                fileNameob = uploadFileName[0].split("_");
                Object[] obzl = newline.replace(" ", "").split("\\|");
                bnk.setPayordno(obzl[0].toString());
                bnk.setSystrcno(obzl[1].toString());
                bnk.setPan(obzl[7].toString());
                bnk.setAcqsettledate(obzl[9].toString());
                bnk.setMerchno(fileNameob[1].toString());
                bnk.setAmount(Long.valueOf(obzl[8].toString()));
                bnk.setRetcode("00");
                bnk.setInstiid(instiid);
                bnkTxnList.add(bnk);
            }
        }
        }finally {
            if (brfile != null) {
                brfile.close();
            }
        }
        return bnkTxnList;
        
    }
}