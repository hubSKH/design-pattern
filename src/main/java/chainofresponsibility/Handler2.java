package chainofresponsibility;
//第二个具体处理者，处理>=0但小于10的
public class Handler2 extends Handler {

	@Override
	protected int getHandlerLevel() {
		return 2;
	}

	@Override
	public String response(int level) {
		return "该请求由 Handler2 处理...";
	}
}
