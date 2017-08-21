/**   
* @Title: Test.java 
* @Package com.algo.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Lenson
* @date 2017��8��16�� ����2:04:18 
* @version V1.0   
*/
package com.algo.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.algo.word.*;

/**
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args){
		String basePath = System.getProperty("user.dir");
		
		List<String> fileList = new ArrayList<String>();
		traverseFolder2("E:/�´ʷ�������Դ/֢״/",".txt",fileList);
		String strInOne = "";
		for(String perPath : fileList)
		{
			strInOne += ("," + perPath);
		}
		if("".equals(strInOne)) return;
		strInOne = strInOne.substring(1);
		String[] argsx = {strInOne, "C:/Users/Administrator/Desktop/output.txt", "src/main/resources/CHStopWords.txt","5","80,10,10,10"};
		Main.main(argsx);
	}
    private static void traverseFolder2(String path,String key,List<String> list){

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                //BltLog.Print("�ļ����ǿյ�!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        traverseFolder2(file2.getAbsolutePath(),key,list);
                    } else {
                    	String fileName = file2.getAbsolutePath();
                    	if(fileName.contains(key))
                    	{
                    		list.add(fileName);
                    	}
                        
                    }
                }
            }
        } else {
        }
		return;
    	
    }

}
