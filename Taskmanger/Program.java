package in.santhosh.taskmanager;

import in.santhosh.swt.Application;
public class Program {

	public static void main(String[] args) {

		Application
			.instance
			.setTitle("Email Composer")
			.build(new TaskManagerUi())
			.run();
	}
}