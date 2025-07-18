# Trie Autocomplete System

## Problem Statement
Build an autocomplete system where given a list of dictionary words and a prefix typed by a user, suggest all words that begin with that prefix.

## Real-World Relevance
Used in search engines like Google, autocomplete features in messaging apps, and coding IDEs.

## Why Trie?
Trie efficiently supports:
- Insertions in O(N)
- Prefix-based search in O(K), where K = length of the prefix

This makes it ideal for building autocomplete systems.

## Example
**Input Dictionary:** ["cat", "car", "cart", "dog", "dove", "deal"]  
**Prefix:** "ca"  
**Output:** ["cat", "car", "cart"]
