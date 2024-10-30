# ViewPager2 with TabLayout Navigation

This project demonstrates how to implement fragment navigation using **ViewPager2** with a **TabLayout** in an Android application. The app includes three fragments that users can navigate between by either swiping or clicking on each tab.

## Features

- **Swipe Navigation**: Users can swipe left or right to move between fragments.
- **Tab Navigation**: Each fragment is accessible by clicking on its corresponding tab.
- **Fragment Layouts**:
  - **Fragment 1**: Displays an introduction to the application with a title and descriptive text.
  - **Fragment 2**: Shows a list of items (e.g., cities or countries) using a `RecyclerView`.
  - **Fragment 3**: Contains an image with descriptive text below it.

## Project Structure

- **MainActivity**: Contains the `ViewPager2` and `TabLayout` to manage navigation between fragments.
- **ViewPagerAdapter**: Adapter class to handle fragment management.
- **Fragments**:
  - `FragmentPresentation`: Displays introductory content.
  - `FragmentList`: Shows a list of items with a `RecyclerView`.
  - `FragmentPresentationWithImage`: Displays an image with additional descriptive text.
