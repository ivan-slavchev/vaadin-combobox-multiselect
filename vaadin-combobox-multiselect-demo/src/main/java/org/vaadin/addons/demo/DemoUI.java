package org.vaadin.addons.demo;

import javax.servlet.annotation.WebServlet;

import org.vaadin.addons.ComboBoxMultiselect;
import org.vaadin.addons.demo.util.DemoItem;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Theme("demo")
@Title("MyComponent Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void init(final VaadinRequest request) {
        // Show it in the middle of the screen
        final VerticalLayout layout = new VerticalLayout();

        layout.setSpacing(false);

        final Label h1 = new Label("org.vaadin.addons.ComboBoxMultiselect");
        h1.addStyleName(ValoTheme.LABEL_H1);
        layout.addComponent(h1);

        final HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        layout.addComponent(row);


//        final List<String> coboboxMultiselectList = Arrays.asList("Werner", "Paul", "Klaus", "Fred", "Jens", "Helge", "Arne", "Achim", "Peter", "Norbert", "Erni", "Bert");
//        final ComboBoxMultiselect<String> comboTest = new ComboBoxMultiselect<>("Plain with 12 items");
//        comboTest.setPlaceholder("You can type here");
//        comboTest.showSelectAllButton(true);
//        comboTest.showClearButton(true);
//        comboTest.setItems(coboboxMultiselectList);
//        row.addComponent(comboTest);
//
//
//        ComboBoxMultiselect<DemoItem> combo = new ComboBoxMultiselect<>("Normal");
//        combo.setPlaceholder("You can type here");
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.showSelectAllButton(true);
//        combo.showClearButton(true);
//        combo.setItems(DemoItem.generate(46));
//        final Iterator<DemoItem> iterator = ((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                .iterator();
//        iterator.next();
//        combo.setValue(new HashSet<>(Arrays.asList(iterator.next(), iterator.next(), iterator.next())));
//        row.addComponent(combo);
//
//        final CssLayout group = new CssLayout();
//        group.setCaption("Grouped with a Button");
//        group.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
//        row.addComponent(group);
//
//        combo = new ComboBoxMultiselect<>();
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(69));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.setWidth("240px");
//        group.addComponent(combo);
//        final Button today = new Button("Do It");
//        group.addComponent(today);
//
//        combo = new ComboBoxMultiselect<>("Explicit size");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setWidth("260px");
//        combo.setHeight("60px");
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("No text input allowed");
//        combo.setPlaceholder("You can click here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setTextInputAllowed(false);
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Error");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setComponentError(new UserError("Fix it, now!"));
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Error, borderless");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setComponentError(new UserError("Fix it, now!"));
//        combo.addStyleName(ValoTheme.COMBOBOX_BORDERLESS);
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Disabled");
//        combo.setPlaceholder("You can't type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setEnabled(false);
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Custom color");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.addStyleName("color1");
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Custom color");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.addStyleName("color2");
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Custom color");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.addStyleName("color3");
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Small");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.addStyleName(ValoTheme.COMBOBOX_SMALL);
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Large");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.addStyleName(ValoTheme.COMBOBOX_LARGE);
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Borderless");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setValue(new HashSet<>(Arrays.asList(((ListDataProvider<DemoItem>) combo.getDataProvider()).getItems()
//                                                   .iterator()
//                                                   .next())));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.addStyleName(ValoTheme.COMBOBOX_BORDERLESS);
//        row.addComponent(combo);
//
//        combo = new ComboBoxMultiselect<>("Tiny");
//        combo.setPlaceholder("You can type here");
//        combo.setItems(DemoItem.generate(200));
//        combo.setItemCaptionGenerator(DemoItem::getCaption);
//        combo.setItemIconGenerator(DemoItem::getIcon);
//        combo.addStyleName(ValoTheme.COMBOBOX_TINY);
//        row.addComponent(combo);
//
        ComboBox<DemoItem> comboSingle = new ComboBox<>("Huge");
        comboSingle.setPlaceholder("You can type here");
        comboSingle.setItems(DemoItem.generate(200));
        comboSingle.setItemCaptionGenerator(DemoItem::getCaption);
        comboSingle.setPopupWidth(null);
        comboSingle.setPageLength(25);
        comboSingle.setEmptySelectionAllowed(true);
        row.addComponent(comboSingle);

        ComboBoxMultiselect<DemoItem> combo = new ComboBoxMultiselect<>("Huge");
        combo.setPlaceholder("You can type here");
        combo.setItems(DemoItem.generate(200));
        combo.setItemCaptionGenerator(DemoItem::getCaption);
        combo.setPopupWidth(null);
        combo.setPageLength(25);
        combo.showClearButton(true);
        combo.showSelectAllButton(true);
        row.addComponent(combo);

        setContent(layout);
    }
}
