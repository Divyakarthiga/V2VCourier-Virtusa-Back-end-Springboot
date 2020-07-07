import { Component, OnInit } from '@angular/core';
import { AddPostService } from '../add-post.service';
import { Observable } from 'rxjs';
import { PostPayload } from '../add-post/post-payload';

@Component({
  selector: 'app-view-post',
  templateUrl: './view-post.component.html',
  styleUrls: ['./view-post.component.css']
})
export class ViewPostComponent implements OnInit {
  posts:Observable<Array<PostPayload>>;

  constructor(private postService:AddPostService) { }

  ngOnInit(): void {
    this.posts= this.postService.getAllPosts();
  }

}
