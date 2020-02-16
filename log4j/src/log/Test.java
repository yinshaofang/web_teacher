package log;

import org.apache.log4j.Logger;

/**
 * log4j 即logforjava 分析日志
 * 系统部署在Linux上
 *一般log4j日志被框架自动调用，检测到log.debug
 */
public class Test {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Test.class);
        log.debug("debug:错误信息1");
        log.info("info:错误信息2");
        log.warn("warn:warn....");
        log.error("error:error....");
        log.fatal("fatal:fatal....");

        try{
            System.out.println(1/0);
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }
}
