package chainofresponsibility;
//处理者
public abstract class Handler {
	private  Handler next;
	String handleRequest(int level){
		if(this.getHandlerLevel ()>=level){
			return this.response (level);
		}
		if(next ==null){
			return  "没有合适的处理器处理该请求...";
		}
		return this.next.handleRequest (level);
	}
	void setNextHandler(Handler next){
		this.next=next;
	}
	//处理级别
	protected abstract int getHandlerLevel();

	//处理请求
	public abstract String response(int level);
}
