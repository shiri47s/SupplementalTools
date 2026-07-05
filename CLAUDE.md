# Project Instructions

## Project Type

This is a Minecraft mod project written mainly in Java.

The project may target:
- Fabric
- NeoForge
- Architectury
- Gradle
- Mixin

## Language Policy

- Communicate with the user in Japanese.
- Write source code, comments, JavaDoc, commit messages, documentation, and technical artifacts in English unless explicitly requested otherwise.
- Keep code comments minimal and meaningful.
- Do not add obvious comments.

## Core Development Principles

- Keep Vanilla behavior compatibility as the highest priority.
- Preserve existing behavior unless the requested task clearly requires behavior changes.
- Prefer maintainable, explicit, and project-consistent code.
- Related cleanup is allowed when it directly supports the requested change.
- Avoid unrelated refactoring.
- Do not modify unrelated files.
- Do not edit generated files.
- Do not modify assets, translations, metadata, or resource files unless explicitly requested.

## Change Scope

- Changes may include directly related files when needed for consistency, correctness, or maintainability.
- Do not perform broad architectural rewrites without approval.
- Do not change public APIs unless explicitly requested or clearly required by the task.
- If a public API change appears necessary, explain the reason and ask for approval before editing.
- Keep diffs focused and reviewable.

## Before Editing

Before modifying files, always explain:

1. Implementation plan.
2. Target files.
3. Reason for each change.
4. Expected behavior.
5. Verification approach.

Ask for approval before:
- Large changes.
- Public API changes.
- Gradle or dependency changes.
- Minecraft version changes.
- Loader version changes.
- Repository-wide refactoring.

## After Editing

After modifying files, always summarize:

1. Files changed.
2. Behavior changed.
3. Important implementation details.
4. Build/test result, if executed.
5. Remaining risks.
6. Recommended next steps.

## Java Style

- Use modern Java features where they improve clarity, safety, or maintainability.
- Do not use modern Java features only to make code shorter.
- Prefer clear control flow over overly clever expressions.
- Avoid unnecessary abstraction.
- Avoid excessive Stream API usage when a loop is clearer.
- Avoid Optional in fields and performance-sensitive paths unless already used by the project.
- Follow the existing code style of the surrounding files.
- Keep member variables in lower camelCase.
- Keep names descriptive and domain-appropriate.

## Minecraft Mod Rules

- Vanilla compatibility is the first priority.
- For item behavior, compare against Vanilla implementation patterns before changing logic.
- For block placement behavior, preserve replaceable-block and interaction behavior.
- For interaction methods, pay attention to:
    - use()
    - useOnBlock()
    - interact()
    - interaction result handling
    - hand swing behavior
    - client/server side effects
- Avoid changing gameplay behavior unless explicitly requested.
- If behavior differs from Vanilla, explain why.

## Fabric / NeoForge / Architectury Policy

- Fabric is the primary implementation target.
- NeoForge support should be preserved where reasonably possible.
- When behavior differs between loaders, explain the difference clearly.
- Prefer Architectury APIs when they maintain compatibility and reduce loader-specific code.
- Use loader-specific code only when necessary.
- Keep common logic in common modules when possible.
- Keep client-only code separated from common/server code.
- Do not move code between common, Fabric, and NeoForge modules without explaining the reason.

## Mixin Policy

- Mixin usage is allowed when necessary.
- Prefer stable and maintainable injection strategies.
- Use Inject when it is suitable and robust.
- Redirect, ModifyArg, ModifyVariable, and similar approaches may be used when justified.
- Before editing a Mixin, verify:
    - target class
    - target method name
    - method descriptor
    - Minecraft version compatibility
    - client/server side
    - injection point stability
- Avoid fragile injection points when a safer injection point is available.
- Do not suppress Mixin warnings without explaining the underlying cause.
- If a Mixin targets client-only code, keep it isolated from server/common code.
- When a Mixin fails due to a Minecraft version change, update the descriptor carefully and explain the compatibility impact.

## Gradle and Dependency Policy

- Do not change Gradle versions, plugin versions, Minecraft versions, loader versions, mappings, or dependency versions without approval.
- Dependency or Gradle changes may be proposed.
- Apply dependency or Gradle changes only after approval.
- Prefer minimal Gradle changes.
- Explain any dependency conflict, version mismatch, or loader compatibility issue before editing.

## Build and Test Policy

Build and test commands may be executed automatically only when they are directly relevant to error verification, error fixing, or final validation.

Before running long or expensive tasks, ask for confirmation.

Useful commands:

### macOS / Linux

```bash
./gradlew build
./gradlew test
```

### Windows

```powershell
.\gradlew.bat build
.\gradlew.bat test
```

If a build or test fails:
- Summarize the failure.
- Identify the likely cause.
- Propose the next fix.
- Do not blindly repeat the same command.

## Git Policy

- Commit is allowed only when the user requests it or clearly approves it.
- Never push automatically.
- Never create pull requests automatically.
- Before committing, summarize the pending diff.
- Use concise English commit messages.
- Do not include unrelated changes in a commit.
- If the working tree already contains user changes, do not overwrite them.
- If unexpected changes are found, stop and ask for guidance.

## Review Policy

When asked to review the project, do not edit files immediately.

First report findings grouped by:
1. Critical issues.
2. Compatibility risks.
3. Maintainability issues.
4. Loader-specific issues.
5. Mixin risks.
6. Gradle/dependency risks.
7. Suggested implementation order.

## Performance Policy

- Prefer readability, compatibility, and maintainability over micro-optimization.
- Optimize only when the code is performance-sensitive or the issue is measurable.
- Avoid allocations in hot paths when practical.
- Do not introduce caching unless the invalidation behavior is clear.
- Explain performance trade-offs when making performance-related changes.

## Safety Rules

- Do not delete code unless the reason is explicit and justified.
- Do not remove tests unless explicitly requested.
- Do not change license files.
- Do not change publishing configuration unless explicitly requested.
- Do not change package names or mod IDs unless explicitly requested.
- Do not change resource namespaces unless explicitly requested.
- Do not assume behavior from memory when source code can be inspected.

## Preferred Workflow

Use this workflow for non-trivial tasks:

1. Inspect relevant files.
2. Explain findings.
3. Propose a plan.
4. Wait for approval if the change is large or risky.
5. Implement focused changes.
6. Run relevant verification when appropriate.
7. Summarize results and risks.

## Default Priorities

When priorities conflict, use this order:

1. Correctness.
2. Vanilla compatibility.
3. Loader compatibility.
4. Maintainability.
5. Minimal reviewable diffs.
6. Performance.
7. Convenience.
