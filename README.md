# Kotlin MutableList removeIf Bug

This repository demonstrates a common issue encountered when using Kotlin's `MutableList.removeIf` function. The `removeIf` function modifies the list in-place while iterating, which can lead to unexpected results if not handled carefully. The bug example shows how using `removeIf` with a condition that relies on the current index or elements' values can skip elements.

## Bug Description

The `removeIf` function iterates over the list and removes elements that satisfy the given predicate. However, if an element is removed, the subsequent elements shift their indices.  This means that elements following a removed element may be skipped unintentionally.

## Solution

To avoid this, we can iterate over the list in reverse order using an iterator. This prevents issues with index shifting, ensuring all elements are checked correctly.
