# Contributing

## Branching strategy

- `main` always contains stable, reviewed code.
- Create one branch per change from `main`, using these prefixes:
  - `feature/<name>` for new features or documentation (e.g. `feature/code-documentation`)
  - `fix/<name>` for corrections (e.g. `fix/readme-improvements`)

## Commit conventions

Use short, descriptive messages with a type prefix:

- `feat:` new functionality
- `fix:` bug fix
- `docs:` documentation changes
- `refactor:` code changes that do not alter behavior

Example: `docs: improve README instructions`

## Pull Request rules

1. Open the PR against `main`.
2. Describe clearly what you changed and why.
3. Request at least one reviewer.
4. Do not merge your own changes without a review, except in individual exercises.
5. If a PR is rejected, the reviewer must explain the technical reason in a comment.