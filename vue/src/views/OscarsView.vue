<template>
  <div class="oscars">
    <h1>Oscars Night 2023</h1>
    <h2>Make your guesses!</h2>
    <div>
      <div class="category" v-for="category in categories" :key="category.categoryId">
        <h3>{{ category.name }}</h3>
        <table>
          <tbody>
            <tr>
              <th>Nomination Top</th>
              <th>Nomination Bottom</th>
              <th>Your Selection</th>
              <th>Winner</th>
            </tr>
            <tr>
              <td>{{ category.nominationOneTop }}</td>
              <td>{{ category.nominationOneBottom }}</td>
              <td>blank</td>
              <td>TBD</td>
            </tr>
            <tr>
              <td>{{ category.nominationTwoTop }}</td>
              <td>{{ category.nominationTwoBottom }}</td>
              <td>blank</td>
              <td>TBD</td>
            </tr>
            <tr>
              <td>{{ category.nominationThreeTop }}</td>
              <td>{{ category.nominationThreeBottom }}</td>
              <td>blank</td>
              <td>TBD</td>
            </tr>
            <tr>
              <td>{{ category.nominationFourTop }}</td>
              <td>{{ category.nominationFourBottom }}</td>
              <td>blank</td>
              <td>TBD</td>
            </tr>
            <tr>
              <td>{{ category.nominationFiveTop }}</td>
              <td>{{ category.nominationFiveBottom }}</td>
              <td>blank</td>
              <td>TBD</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
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

<style>
.oscars {
  background-color: goldenrod;
}

.category {
  border: 1px solid blue;
  
}
</style>


