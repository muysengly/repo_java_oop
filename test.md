---
marp: true
theme: default
---

# Custom Bullets

## abc

### abc

## abc

# Custom Bullets

## abc

## abc

- First item
  - Fourth item
    - Fifth item
- Second item
- Third item

<!--
style: |
  /* Reset all counters at the body level */
    body {
        counter-reset: h1 h2 h3 h4 h5 h6;
    }

    /* h1 styling and counter */
    h1 {
        counter-reset: h2 h3 h4 h5 h6;
        counter-increment: h1 ;
    }

    h1::before {
        content: counter(h1) ". ";
    }

    /* h2 styling and counter */
    h2 {
        counter-reset: h3 h4 h5 h6;
        counter-increment: h2;
    }

    h2::before {
        content: counter(h1) "." counter(h2) ". ";
    }

    /* h3 styling and counter */
    h3 {
        counter-reset: h4 h5 h6;
        counter-increment: h3;
    }

    h3::before {
        content: counter(h1) "." counter(h2) "." counter(h3) ". ";
    }



 -->
