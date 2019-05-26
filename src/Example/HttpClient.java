package Example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * @author: yan
 * @Date: 2019/5/26/0026 11:30
 * @Description: HttpClient 类
 */
public class HttpClient {
    public static String doGet(String httpUrl) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        String result = null;

        try {
            //创建远程url连接对象
            URL url = new URL(httpUrl);
            //通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            //设置连接方式：get
            connection.setRequestMethod("GET");
            //设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            //设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(60000);
            //发送请求
            connection.connect();
            //通过connectio连接，获取输入流
            if (connection.getResponseCode() == 200) {
                inputStream = connection.getInputStream();
                //封装输入流inputStream，并指定字符串
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                //存放数据
                StringBuffer stringBuffer = new StringBuffer();
                String temp = null;

                while ((temp = bufferedReader.readLine()) != null) {
                    stringBuffer.append(temp);
                    stringBuffer.append("\r\n");
                }

                result = stringBuffer.toString();
            }
        } catch ( MalformedURLException e) {
                e.printStackTrace();
            }
         catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //关闭资源
            if( null !=bufferedReader){
                try {
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(null != inputStream){
                try {
                    inputStream.close();
                }catch (IOException e ){
                    e.printStackTrace();
                }
            }

            connection.disconnect();//关闭远程连接
        }

        return  result;
    }


    public static String doPost(String httpUrl,String param){
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        String result = null;

        try {
            //创建远程url连接对象
            URL url = new URL(httpUrl);
            //通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            //设置连接方式：get
            connection.setRequestMethod("POST");
            //设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            //设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(60000);
            //默认值为false，当向远程服务器传送数据/写数据时，需要设置为true
            connection.setDoOutput(true);
            //默认值为true，当前向远程服务器读数据时，设置为true，读参数可有可无
            connection.setDoInput(true);
            //设置传入参数的格式：请求参数应该是 name1 = value1&name2 =value2 的形式
            connection.setRequestProperty("Content-Type","application/x-ww-form-urlencoded");
            //设置鉴权信息: Authorization:Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0
            connection.setRequestProperty("Authorization","Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");
            //通过连接对象获取一个输出流
            outputStream = connection.getOutputStream();
            //通过输出流对象将参数写出去，它是通过字节数组写出的
            outputStream.write(param.getBytes());
            //通过连接对象获取一个输出流，它是通过字节数组写出来的
            if(connection.getResponseCode() == 200){

                inputStream = connection.getInputStream();
                //对输入流对象进行包装： charset根据工作项目组的要求来设置
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));

                StringBuffer stringBuffer = new StringBuffer();
                String temp = null;
                //循环遍历一行一行读取数据
                while ((temp = bufferedReader.readLine())!=null){
                    stringBuffer.append(temp);
                    stringBuffer.append("\r\n");
                }
                result = stringBuffer.toString();
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
                //关闭资源
                if( null !=bufferedReader){
                    try {
                        bufferedReader.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

                if(null != inputStream){
                    try {
                        inputStream.close();
                    }catch (IOException e ){
                        e.printStackTrace();
                    }
                }

                connection.disconnect();//关闭远程连接
            }


        return  result;
    }
}
