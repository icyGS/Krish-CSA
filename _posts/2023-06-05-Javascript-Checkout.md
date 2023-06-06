---
toc: true
layout: post
description: Amazing opportunity to learn more about Computer Science 
comments: false
categories: [college board]
title: Javascript Checkout
---

<!DOCTYPE html>
<html>
<head>
  <style>
    table {
      border-collapse: collapse;
    }
    
    th, td {
      padding: 8px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }
  </style>
</head>
<body>

<table id="myTable">
  <thead>
    <tr>
      <th onclick="sortTable(0)">Name</th>
      <th onclick="sortTable(1)">Age</th>
      <th onclick="sortTable(2)">Country</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>John</td>
      <td>25</td>
      <td>USA</td>
    </tr>
    <tr>
      <td>Emily</td>
      <td>30</td>
      <td>Canada</td>
    </tr>
    <tr>
      <td>David</td>
      <td>22</td>
      <td>UK</td>
    </tr>
    <tr>
      <td>Sarah</td>
      <td>28</td>
      <td>Australia</td>
    </tr>
  </tbody>
</table>

<script>
  function sortTable(columnIndex) {
    var table, rows, switching, i, x, y, shouldSwitch;
    table = document.getElementById("myTable");
    switching = true;

    while (switching) {
      switching = false;
      rows = table.rows;

      for (i = 1; i < (rows.length - 1); i++) {
        shouldSwitch = false;
        x = rows[i].getElementsByTagName("TD")[columnIndex];
        y = rows[i + 1].getElementsByTagName("TD")[columnIndex];

        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
          shouldSwitch = true;
          break;
        }
      }

      if (shouldSwitch) {
        rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
        switching = true;
      }
    }
  }
</script>

</body>
</html>
