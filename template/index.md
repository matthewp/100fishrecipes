; @layout foundation
; @markdown? false
; @title 100 Fish Recipes

<style>
  .posts {
    list-style-type: none;
    margin-left: 0;
  }

  .posts li {
    border-bottom: 1px solid #EEE;
    padding: 7px 0px;
  }

  .date {
    float: right;
  }
</style>

<div class="row">
  <div class="large-12 columns">
    <h2>Posts</h2>
  </div>
</div>

<div class="row">
  <div class="large-12 columns">
    <ul class="posts">
      @(for posts)
      <li>
        <a href="$(until-last-slash url)/">$(title)</a>
        <span class="date">$(date-format date "MMMM d, yyyy")</span>
      </li>
      @(end)
    </ul>
  </div>
</div>
