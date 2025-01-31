package io.bluestaggo.voxelthing.gui.control;

import io.bluestaggo.voxelthing.gui.screen.GuiScreen;

import java.util.ArrayList;
import java.util.List;

public class Container extends Control {
	protected final List<Control> controls = new ArrayList<>();

	public Container(GuiScreen screen) {
		super(screen);
	}

	public Control addControl(Control control) {
		controls.add(control);
		control.container = this;
		return control;
	}

	@Override
	public void draw() {
		for (Control control : controls) {
			control.draw();
		}
	}

	@Override
	public void checkMouseClicked(int button, int mx, int my) {
		for (Control control : controls) {
			control.checkMouseClicked(button, mx, my);
		}
	}
}
