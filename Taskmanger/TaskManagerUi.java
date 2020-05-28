package in.santhosh.taskmanager;

import in.santhosh.swt.ControlBuilder;
import in.santhosh.swt.Form;
import in.santhosh.swt.UIBuilder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TaskManagerUi implements UIBuilder
{
	public void build(Composite parent)
	{
		FormLayout layout=new FormLayout();
		parent.setLayout(layout);
		
		ControlBuilder builder=new ControlBuilder(parent);
		
		
		Label addTaskLabel = builder.label("Add New Task").get(Label.class);
		final Combo addNewTaskCombo = builder
				.combo(1,"Task1","Task2","Task3")
				.get(Combo.class);
		
		Label taskDetailsLabel = builder.label("Task Details").get(Label.class);
		Text taskDetailsTextBox = builder.textField().get(Text.class);
		
		Label addNotesLabel = builder.label("Add Notes to the Task").get(Label.class);
		Text addNotes = builder.textField().get(Text.class);
		
		
		Form.data().left(5).top(5).applyTo(addTaskLabel);		
		Form.data(50,20).left(addTaskLabel,10).top(5).right(25).applyTo(addNewTaskCombo);
		
		
		Form.data().left(5).top(addTaskLabel,20).applyTo(taskDetailsLabel);
		Form.data(200,20).left(addNewTaskCombo,0,SWT.LEFT).right(50).top(addTaskLabel,20).applyTo(taskDetailsTextBox);
		
		Form.data().left(5).top(taskDetailsLabel,20).applyTo(addNotesLabel);
		Form.data(200,20).left(addTaskLabel,15).right(70).top(addNewTaskCombo,80).bottom(85).applyTo(addNotes);
		
	}
}
