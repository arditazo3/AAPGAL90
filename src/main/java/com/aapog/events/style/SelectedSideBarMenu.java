package com.aapog.events.style;

public class SelectedSideBarMenu {

	private String navItem;
	private String subNavItem;
	private String subNavItem2;
	private String selected;
	private String openItem;
	
	public SelectedSideBarMenu() {
		super();
	}

	public SelectedSideBarMenu(String navItem, String subNavItem, String subNavItem2, String selected, String openItem) {
		super();
		this.navItem = navItem;
		this.subNavItem = subNavItem;
		this.subNavItem2 = subNavItem2;
		this.selected = selected;
		this.openItem = openItem;
	}

	public String getNavItem() {
		return navItem;
	}

	public void setNavItem(String navItem) {
		this.navItem = navItem;
	}

	public String getSubNavItem() {
		return subNavItem;
	}

	public void setSubNavItem(String subNavItem) {
		this.subNavItem = subNavItem;
	}

	public String getSubNavItem2() {
		return subNavItem2;
	}

	public void setSubNavItem2(String subNavItem2) {
		this.subNavItem2 = subNavItem2;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public String getOpenItem() {
		return openItem;
	}

	public void setOpenItem(String openItem) {
		this.openItem = openItem;
	}

	
}
