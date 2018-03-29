package com.myjo.modle.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Service;

import com.myjo.modle.pojo.TianMaItem;
import com.opencsv.CSVReader;


public class ReadCsvService {


	/*public void ReadCsv() {
		CSVReader reader=null;
		InputStreamReader in=null;
		try {
			//解析csv文件
			in = new InputStreamReader(new FileInputStream("D:\\test.csv"), Charset.forName("gbk"));
			reader = new CSVReader(in, ',');
			//读取所有的csv文件
			List<String[]> allRecords = reader.readAll();
			
			List<TianMaItem>itemAL=new ArrayList<>();
			//遍历所有的行
			for (int i = 0; i < allRecords.size(); i++) {
				//去掉标题列
				if (i == 0) {
					continue;
				}
				//取得每一行
				TianMaItem item = new TianMaItem();
				String[] records = allRecords.get(i);
				//便利列,得到每一行的属性
				for (int j = 0; j < records.length; j++) {
					item.setItemId(records[0]);
					item.setSupplier(records[1]);
					item.setChineseSize(records[2]);
					item.setForeignSize(records[3]);
					item.setBrand(records[4]);
					item.setMarketPric(Double.parseDouble(records[5]));
					item.setInventoryNum(Integer.parseInt(records[6]));
					item.setCategory(records[7].charAt(0));
					item.setSmallCategory(records[8]);
					item.setSex(records[9].charAt(0));
					item.setSeason(records[10]);
					item.setDiscount(Integer.getInteger(records[11]));
					//将商品信息添加到ArrayList中。
					itemAL.add(item);
				}
			}
			Map<String,TianMaItem>TMIMap=new HashMap<>();
			//System.out.println(itemAL);
			for(int i=0;i<itemAL.size();i++) {
				TianMaItem tmi = itemAL.get(i);
				TMIMap.put(tmi.getSupplier(), tmi);
			}
		}catch(Exception e) {
			//log.error("csv文件解析失败！");
			e.printStackTrace();
		}finally {
			//资源释放
			try {
				reader.close();
				in.close();
			} catch (IOException e) {
				//log.error("资源释放失败！");
				e.printStackTrace();
			}
		}
	}*/
}
