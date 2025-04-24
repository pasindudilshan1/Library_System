# Contributing to Library_System

Thank you for your interest in contributing to **Library_System**! We welcome improvements, bug fixes, and new features. To make the process smooth for everyone, please follow these guidelines.

---

## 1. Getting Started

1. **Fork** the repository (top right corner of GitHub).
2. **Clone** your fork locally:
   ```bash
   git clone https://github.com/<your-username>/Library_System.git
   cd Library_System
   ```
3. **Set upstream** to stay in sync with the main repo:
   ```bash
   git remote add upstream https://github.com/pasindudilshan1/Library_System.git
   ```
4. **Create a branch** for your work:
   ```bash
   git checkout -b feature/my-new-feature
   ```

---

## 2. Code Style & Quality

- **Java version**: 17
- **Formatting**: Follow standard Java conventions (CamelCase classes, `lowerCamelCase` methods/variables).
- **Indentation**: 4 spaces, no tabs.
- **Dependencies**: Use Maven to manage; update `pom.xml` if adding libraries.
- **FXML/CSS**: Keep UI definitions in `src/main/resources`.

Before submitting, ensure:

```bash
mvn clean compile
```  
and any new tests pass:
```bash
mvn test
```

---

## 3. Writing Tests

- Use **JUnit 5**.
- Place tests in `src/test/java` mirroring the package structure.
- Aim for meaningful unit tests for business logic (e.g., DAO CRUD operations).
- For database tests, use an in-memory H2 database profile. Provide a sample `application-test.properties` if needed.

---

## 4. Issue Management

- **Bug reports**: Prefix title with `BUG:`
- **Feature requests**: Prefix title with `FEATURE:`
- Include a clear description, steps to reproduce, and expected vs. actual behavior.

Before opening a new issue, search existing issues to avoid duplicates.

---

## 5. Pull Request Process

1. Ensure your branch is up to date:
   ```bash
   git fetch upstream
   git merge upstream/master
   ```
2. Commit changes with descriptive messages:
   ```bash
   git commit -m "FEATURE: Add search by ISBN"
   ```
3. Push your branch:
   ```bash
   git push origin feature/my-new-feature
   ```
4. Open a **Pull Request** on GitHub:
   - Base: `master` in `pasindudilshan1/Library_System`
   - Compare: your feature branch
5. In the PR description, reference related issues (e.g., `Closes #12`).

The maintainers will review, leave feedback, and merge when ready.

---

## 6. Code of Conduct

Please respect our [Code of Conduct](CODE_OF_CONDUCT.md) in all interactions.

---

## 7. Contact

For questions or collaboration ideas, reach out via GitHub Discussions or open an issue.

Thank you for making Library_System better! 🚀

