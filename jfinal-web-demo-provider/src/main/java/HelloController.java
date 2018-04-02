import com.jfinal.core.Controller;

/**
 * Created by zhangzh on 2017/6/19.
 */
public class HelloController extends Controller {

    public void index(){
        renderText("hello world!");
    }
}