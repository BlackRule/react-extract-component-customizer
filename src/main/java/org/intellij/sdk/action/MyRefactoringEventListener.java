package org.intellij.sdk.action;


import com.intellij.refactoring.listeners.RefactoringEventData;
import com.intellij.refactoring.listeners.RefactoringEventListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MyRefactoringEventListener implements RefactoringEventListener {

  public static final class DebugHelper {
    public static void breakpoint() {} // Set break point here
  }
  @Override
  public void refactoringStarted(@NotNull String refactoringId, @Nullable RefactoringEventData beforeData) {
   DebugHelper.breakpoint();
  }

  @Override
  public void refactoringDone(@NotNull String refactoringId, @Nullable RefactoringEventData afterData) {
    DebugHelper.breakpoint();

  }

  @Override
  public void conflictsDetected(@NotNull String refactoringId, @NotNull RefactoringEventData conflictsData) {
    DebugHelper.breakpoint();

  }

  @Override
  public void undoRefactoring(@NotNull String refactoringId) {
    DebugHelper.breakpoint();

  }
}
