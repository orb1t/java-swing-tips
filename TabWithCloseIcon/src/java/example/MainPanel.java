// -*- mode:java; encoding:utf-8 -*-
// vim:set fileencoding=utf-8:
// @homepage@

package example;

import java.awt.*;
import java.util.stream.Stream;
import javax.swing.*;

public final class MainPanel extends JPanel {
  private MainPanel() {
    super(new GridLayout(3, 1));

    JTabbedPaneWithCloseButton tab1 = new JTabbedPaneWithCloseButton();
    JTabbedPaneWithCloseIcons tab2 = new JTabbedPaneWithCloseIcons();
    CloseableTabbedPane tab3 = new CloseableTabbedPane();

    Stream.of(tab1, tab2, tab3).map(MainPanel::makeTabbedPane).forEach(this::add);
    setPreferredSize(new Dimension(320, 240));
  }

  private static JTabbedPane makeTabbedPane(JTabbedPane tabbedPane) {
    tabbedPane.addTab("aaa", new JLabel("aaaaaaaa"));
    tabbedPane.addTab("bbb", new JLabel("bbbbbbbbb"));
    tabbedPane.addTab("c", new JLabel("ccc"));
    tabbedPane.addTab("dddd", new JLabel("ddddddd"));
    return tabbedPane;
  }

  public static void main(String... args) {
    EventQueue.invokeLater(new Runnable() {
      @Override public void run() {
        createAndShowGui();
      }
    });
  }

  public static void createAndShowGui() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
      ex.printStackTrace();
    }
    JFrame frame = new JFrame("@title@");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MainPanel());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
