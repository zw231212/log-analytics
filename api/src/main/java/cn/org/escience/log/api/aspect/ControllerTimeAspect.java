package cn.org.escience.log.api.aspect;

import cn.org.escience.log.api.web.entity.response.APIResponse;
import cn.org.escience.log.api.web.entity.response.Message;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 如何起作用？
 */
@Aspect
public class ControllerTimeAspect {
  private static final Logger logger = LoggerFactory.getLogger(ControllerTimeAspect.class);

  private Long start;
  private Long end;

  /**
   * 切入点声明
   * 匹配包及其子包下的所有类的所有方法
   */
  @Pointcut("execution(* cn.org.escience.log.api.web.api..*.*(..))")
  public void aopPointCut(){}

//  @Before("aopPointCut()")
//  public void before(JoinPoint joinPoint){
//    start = System.currentTimeMillis();
//  }
//
//  @After("aopPointCut()")
//  public void after(JoinPoint joinPoint){
//    end = System.currentTimeMillis()-start;
//    String classAndMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
//    logger.info("执行 " + classAndMethod + " 耗时为：" + end + "ms");
//  }

  /**
   * 统计方法耗时环绕通知
   * @param joinPoint
   */
  @Around("aopPointCut()")
  public Object timeAround(ProceedingJoinPoint joinPoint) {
    APIResponse obj;

    try {
      // 获取开始时间
      start = System.currentTimeMillis();
      // 获取返回结果集
      obj = (APIResponse) joinPoint.proceed(joinPoint.getArgs());
      // 获取方法执行时间
    } catch (Throwable e) {
      e.printStackTrace();
      obj = APIResponse.fail(Message.error(e.getMessage()));
    }
    end = System.currentTimeMillis() - start;
    String classAndMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
    logger.info("执行 " + classAndMethod + " 耗时为：" + end + " ms");
//    obj.setCostTimeMillis(end);

    //获取常见的查询关键词的值，存入数据库中进行记录保存
    return obj;
  }
}
