package chainofresponsibility;
//第三个具体处理者，处理>=0但小于10的
public class Handler3 extends Handler {

	@Override
	protected int getHandlerLevel() {
		return 3;
	}

	@Override
	public String response(int level) {
		return "该请求由 Handler3 处理....";
	}
}
