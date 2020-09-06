package chainofresponsibility;
//第一个具体处理者，处理小于0的
public class Handler1 extends Handler {

	@Override
	protected int getHandlerLevel() {
		return 1;
	}

	@Override
	public String response(int level) {
		return "该请求由 Handler1 处理...";
	}
}
