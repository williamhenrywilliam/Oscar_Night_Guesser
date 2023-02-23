<template>
  <div class="about">
    <h1>This is an about page</h1>
    <ul>
      <li v-for="category in categories" :key="category.categoryId">
        <h2>{{ category.name }}</h2>
        <ul>
          <li>{{ category.nominationOneTop }} - {{ category.nominationOneBottom }}</li>
          <li>{{ category.nominationTwoTop }} - {{ category.nominationTwoBottom }}</li>
          <li>{{ category.nominationThreeTop }} - {{ category.nominationThreeBottom }}</li>
          <li>{{ category.nominationFourTop }} - {{ category.nominationFourBottom }}</li>
          <li>{{ category.nominationFiveTop }} - {{ category.nominationFiveBottom }}</li>
        </ul>
      </li>
    </ul>
  </div>
</template>


<script>
import CategoryService from '@/services/CategoryService';

export default {
  data() {
    return {
      categories: []
    }
  },
  mounted() {
    CategoryService.getAllCategories()
      .then(response => {
        console.log(response);
        this.categories = response.data;
      })
      .catch(error => {
        console.log(error);
      });
  }
}
</script>


