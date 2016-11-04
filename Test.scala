import spray.json._

object Test {
	def main(args : Array[String]) {
	  val s = """{"@timestamp":"2016-04-30T07:45:58.000Z","http_host":"loan-m.jimu.com","status":200,"scheme":"https","request":"/public/images/icon-wrong.png","method":"GET","remote_addr":"60.5.6.55","request_time":0.001,"response_time":0.001,"body_bytes_sent":861,"http_referrer":"https://loan-m.jimu.com/loanv2/apply/limit","http_user_agent":"Mozilla/5.0 (Linux; Android 4.4.4; 6607 Build/KTU84P) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/33.0.0.0 Mobile Safari/537.36 jimubox/5.2.1 android_app_jimubox","http_x_forwarded_for":"-","http_upstream":"172.16.112.248:8080","cookie_id":"1462002326829","user_id":0,"session_id":"0c297e69-b71d-48a5-bd8e-7d0270ee20f4-w","cookie_stock_flight":"-","@version":"1","type":"nginx_access_json","host":"lb-02.lan.zhaowei.jimubox.com","path":"/var/log/nginx/access.json","client_addr":"60.5.6.55"}"""
	   println(s)
	   val j = s.parseJson.asInstanceOf[JsObject].fields 
	   if(j.contains("scheme")) {
	     println(j("scheme"))
	   }
 	}
}