# Summer-Assignment-2401920100209
Summer Assignment solutions of roll no. 2401920100209

# 📚 Summer Assignment — Roll No. 2401920100209

A structured 4-week plan covering **Data Structures & Algorithms** (Arrays → Strings → Linked Lists/Stack/Queue → Trees) alongside weekly **Object-Oriented Programming** problems in Java.

---

## 🗂️ Repository Structure

```
Summer-Assignment-2401920100209/
├── Week_1/        # Arrays + Basic Strings + OOP: Interfaces (Library System)
├── Week_2/        # Advanced Strings + OOP: Packages & Interfaces (Music)
├── Week_3/        # Linked List + Stack + Queue + OOP: Abstract Classes (Train)
└── Week_4/        # Trees + OOP: Interfaces, Inner Classes, Inheritance
```

---

## 📅 Week 1 — Arrays + Basic Strings

### Day 1: Array Basics
| # | Problem | Link |
|---|---------|------|
| 1 | Two Sum | [LeetCode](https://leetcode.com/problems/two-sum/) |
| 2 | Remove Duplicates from Sorted Array | [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) |
| 3 | Best Time to Buy and Sell Stock | [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |

### Day 2: Prefix Sum / Sliding Window
| # | Problem | Link |
|---|---------|------|
| 1 | Maximum Subarray | [LeetCode](https://leetcode.com/problems/maximum-subarray/) |
| 2 | Contains Duplicate | [LeetCode](https://leetcode.com/problems/contains-duplicate/) |
| 3 | Maximum Average Subarray I | [LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/) |

### Day 3: Two Pointer
| # | Problem | Link |
|---|---------|------|
| 1 | Move Zeroes | [LeetCode](https://leetcode.com/problems/move-zeroes/) |
| 2 | Squares of a Sorted Array | [LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/) |
| 3 | Container With Most Water | [LeetCode](https://leetcode.com/problems/container-with-most-water/) |

### Day 4: Matrix Problems
| # | Problem | Link |
|---|---------|------|
| 1 | Matrix Diagonal Sum | [LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/) |
| 2 | Reshape the Matrix | [LeetCode](https://leetcode.com/problems/reshape-the-matrix/) |
| 3 | Spiral Matrix | [LeetCode](https://leetcode.com/problems/spiral-matrix/) |

### Day 5: String Basics
| # | Problem | Link |
|---|---------|------|
| 1 | Valid Palindrome | [LeetCode](https://leetcode.com/problems/valid-palindrome/) |
| 2 | Reverse String | [LeetCode](https://leetcode.com/problems/reverse-string/) |
| 3 | Longest Common Prefix | [LeetCode](https://leetcode.com/problems/longest-common-prefix/) |

### 🔷 OOP Problem of the Week — Interfaces (Library System)

**Topic:** Interfaces

Design a library system for two user roles: `KidUser` and `AdultUser`.

- **Interface:** `LibraryUser` with methods `registerAccount()` and `requestBook()`
- **`KidUser`:** registers if `age < 12`; can borrow `"Kids"` books for **10 days**
- **`AdultUser`:** registers if `age > 12`; can borrow `"Fiction"` books for **7 days**
- **Demo class:** `LibraryInterfaceDemo.java` — runs test cases for both user types

> 📁 Solution: `Week_1/OOPS.java`

---

## 📅 Week 2 — Strings (Advanced)

### Day 1: Hashing in Strings
| # | Problem | Link |
|---|---------|------|
| 1 | Valid Anagram | [LeetCode](https://leetcode.com/problems/valid-anagram/) |
| 2 | First Unique Character in a String | [LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/) |
| 3 | Ransom Note | [LeetCode](https://leetcode.com/problems/ransom-note/) |

### Day 2: Sliding Window on Strings
| # | Problem | Link |
|---|---------|------|
| 1 | Longest Substring Without Repeating Characters | [LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| 2 | Permutation in String | [LeetCode](https://leetcode.com/problems/permutation-in-string/) |
| 3 | Find All Anagrams in a String | [LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/) |

### Day 3: Pattern Matching
| # | Problem | Link |
|---|---------|------|
| 1 | Implement strStr() | [LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |
| 2 | Is Subsequence | [LeetCode](https://leetcode.com/problems/is-subsequence/) |
| 3 | Repeated Substring Pattern | [LeetCode](https://leetcode.com/problems/repeated-substring-pattern/) |

### Day 4: Recursion + Strings
| # | Problem | Link |
|---|---------|------|
| 1 | Reverse Words in a String III | [LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/) |
| 2 | Decode String | [LeetCode](https://leetcode.com/problems/decode-string/) |
| 3 | Generate Parentheses | [LeetCode](https://leetcode.com/problems/generate-parentheses/) |

### Day 5: Mixed String Problems
| # | Problem | Link |
|---|---------|------|
| 1 | Group Anagrams | [LeetCode](https://leetcode.com/problems/group-anagrams/) |
| 2 | String Compression | [LeetCode](https://leetcode.com/problems/string-compression/) |
| 3 | Longest Palindromic Substring | [LeetCode](https://leetcode.com/problems/longest-palindromic-substring/) |

### 🔷 OOP Problem of the Week — Packages & Interfaces (Music)

**Topic:** Packages + Interfaces

- **Interface:** `Playable` (in package `music`) with method `void play()`
- **`Veena`** (package `music.string`) and **`Saxophone`** (package `music.wind`) both implement `Playable`
- **`Test`** class (package `live`): creates instances of both, calls `play()`, and stores them in a `Playable` reference

---

## 📅 Week 3 — Linked List + Stack + Queue

### Part A — Linked List

#### Day 1
| # | Problem | Link |
|---|---------|------|
| 1 | Linked List Cycle | [LeetCode](https://leetcode.com/problems/linked-list-cycle/) |
| 2 | Reverse Linked List | [LeetCode](https://leetcode.com/problems/reverse-linked-list/) |
| 3 | Middle of the Linked List | [LeetCode](https://leetcode.com/problems/middle-of-the-linked-list/) |

#### Day 2
| # | Problem | Link |
|---|---------|------|
| 1 | Merge Two Sorted Lists | [LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/) |
| 2 | Remove Nth Node From End of List | [LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) |
| 3 | Palindrome Linked List | [LeetCode](https://leetcode.com/problems/palindrome-linked-list/) |

### Part B — Stack

#### Day 3
| # | Problem | Link |
|---|---------|------|
| 1 | Valid Parentheses | [LeetCode](https://leetcode.com/problems/valid-parentheses/) |
| 2 | Min Stack | [LeetCode](https://leetcode.com/problems/min-stack/) |
| 3 | Next Greater Element I | [LeetCode](https://leetcode.com/problems/next-greater-element-i/) |

#### Day 4
| # | Problem | Link |
|---|---------|------|
| 1 | Daily Temperatures | [LeetCode](https://leetcode.com/problems/daily-temperatures/) |
| 2 | Evaluate Reverse Polish Notation | [LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/) |
| 3 | Largest Rectangle in Histogram | [LeetCode](https://leetcode.com/problems/largest-rectangle-in-histogram/) |

### Part C — Queue / Deque

#### Day 5
| # | Problem | Link |
|---|---------|------|
| 1 | Implement Queue using Stacks | [LeetCode](https://leetcode.com/problems/implement-queue-using-stacks/) |
| 2 | Number of Recent Calls | [LeetCode](https://leetcode.com/problems/number-of-recent-calls/) |
| 3 | Sliding Window Maximum | [LeetCode](https://leetcode.com/problems/sliding-window-maximum/) |

### 🔷 OOP Problem of the Week — Abstract Classes (Train Compartments)

**Topic:** Abstract Classes + Polymorphism

- **Abstract class:** `Compartment` with abstract method `public abstract String notice()`
- **Subclasses:** `FirstClass`, `Ladies`, `General`, `Luggage` — each overrides `notice()` with a compartment-specific message
- **`TestCompartment`:** creates an array of 10 `Compartment` objects, assigns types based on a random integer (1–4), and demonstrates polymorphic behavior

---

## 📅 Week 4 — Trees

### Day 1: Binary Tree Basics
| # | Problem | Link |
|---|---------|------|
| 1 | Maximum Depth of Binary Tree | [LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/) |
| 2 | Invert Binary Tree | [LeetCode](https://leetcode.com/problems/invert-binary-tree/) |
| 3 | Same Tree | [LeetCode](https://leetcode.com/problems/same-tree/) |

### Day 2: Traversals
| # | Problem | Link |
|---|---------|------|
| 1 | Binary Tree Inorder Traversal | [LeetCode](https://leetcode.com/problems/binary-tree-inorder-traversal/) |
| 2 | Binary Tree Level Order Traversal | [LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal/) |
| 3 | Binary Tree Zigzag Level Order Traversal | [LeetCode](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) |

### Day 3: Binary Search Tree
| # | Problem | Link |
|---|---------|------|
| 1 | Search in a Binary Search Tree | [LeetCode](https://leetcode.com/problems/search-in-a-binary-search-tree/) |
| 2 | Validate Binary Search Tree | [LeetCode](https://leetcode.com/problems/validate-binary-search-tree/) |
| 3 | Lowest Common Ancestor of a BST | [LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) |

### Day 4: Path Based Problems
| # | Problem | Link |
|---|---------|------|
| 1 | Path Sum | [LeetCode](https://leetcode.com/problems/path-sum/) |
| 2 | Diameter of Binary Tree | [LeetCode](https://leetcode.com/problems/diameter-of-binary-tree/) |
| 3 | Binary Tree Maximum Path Sum | [LeetCode](https://leetcode.com/problems/binary-tree-maximum-path-sum/) |

### Day 5: Advanced Trees
| # | Problem | Link |
|---|---------|------|
| 1 | Symmetric Tree | [LeetCode](https://leetcode.com/problems/symmetric-tree/) |
| 2 | Construct Binary Tree from Preorder and Inorder Traversal | [LeetCode](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inordertraversal/) |
| 3 | Serialize and Deserialize Binary Tree | [LeetCode](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) |

### 🔷 OOP Problem of the Week — Mixed OOP Concepts

**Topic:** Interfaces, Inner Classes, and Inheritance

1. **Interface `Test`** with method `square()`; implemented by `Arithmetic` class; used via `ToTestInt` class.
2. **Inner Classes** — `OuterClass` with a `display()` method containing an `Inner` class with its own `display()` method; both called from `main`.
3. **Class `Point`** with private `int x, y`; constructors `Point()` and `Point(int x, int y)`; setter methods `setX`, `setY`, `setXY`.
4. **Classes `Box` and `Box3D`** — `Box3D` extends `Box`; includes constructors, fields for length/breadth/height, and methods to compute area and volume.

---

## 🛠️ Tech Stack

- **Language:** Java
- **Platform:** LeetCode (DSA problems)
- **Concepts:** Arrays, Strings, Linked Lists, Stacks, Queues, Trees, OOP (Interfaces, Abstract Classes, Inheritance, Packages)

---

*Solutions by Naman Saini — Roll No. 2401920100209*
