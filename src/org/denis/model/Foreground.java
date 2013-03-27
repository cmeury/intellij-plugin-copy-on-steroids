package org.denis.model;

import org.jetbrains.annotations.NotNull;

/**
 * @author Denis Zhdanov
 * @since 3/23/13 3:23 PM
 */
public class Foreground extends AbstractFlyweightInfo {

  public Foreground(int id) {
    super(id);
  }

  @Override
  public void invite(@NotNull OutputInfoVisitor visitor) {
    visitor.visit(this);
  }

  @Override
  public String toString() {
    return "foreground=" + getId();
  }
}
